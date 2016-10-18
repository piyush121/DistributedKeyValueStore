package kvstore;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class kvclient {
	private static String HOST = "localhost";
	private static int PORT = 9091; // default
	private static TTransport transport;
	private static TProtocol protocol;
	private static KVStore.Client client;

	public static void main(String[] args) {
		try {
			HOST = args[1].split(":")[0];
			PORT = Integer.parseInt(args[1].split(":")[1]);
			transport = new TSocket(HOST, PORT, 5000);// Will timeout after 5 secs.
			transport.open();
			protocol = new TBinaryProtocol(transport);
			client = new KVStore.Client(protocol);

			int length = args.length;
			Result result = null;
			switch (length) {
			
			// either get or delete
			case 4:
				if (args[2].equals("-get")) {
					result = client.kvget(args[3]);
					if (result.getError() == ErrorCode.kSuccess) {
						System.out.println(result);
						System.exit(0);
					} else if (result.getError() == ErrorCode.kKeyNotFound) {
						System.err.println(result.errortext);
						System.exit(1);
					} else {
						System.err.println(result.errortext);
						System.exit(2);
					}
				} else if (args[2].equals("-del")) {
					result = client.kvdelete(args[3]);
					if (result.getError() == ErrorCode.kSuccess) {
						System.out.println("Success");
						System.exit(0);
					} else if (result.getError() == ErrorCode.kKeyNotFound) {
						System.err.println(result.errortext);
						System.exit(1);
					} else {
						System.err.println(result.errortext);
						System.exit(2);
					}
				}
				break;
			case 5: // set command sent.
				if (args[2].equals("-set")) {
					result = client.kvset(args[3], args[4]);
					if (result.getError() == ErrorCode.kSuccess) {
						System.out.println(result);
						System.exit(0);
					} else {
						System.err.println(result.errortext);
						System.exit(2);
					}
				}
				break;
			default:
				System.err.println("Command does not exist or Wrong arguments passed.");
			}

		} catch (TTransportException ex) {
			ex.printStackTrace();
		} catch (TException tx) {
			tx.printStackTrace();
		}
	}

}