/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#ifndef TUTORIAL_TYPES_H
#define TUTORIAL_TYPES_H

/* base includes */
#include <glib-object.h>
#include <thrift/c_glib/thrift_struct.h>
#include <thrift/c_glib/protocol/thrift_protocol.h>
/* other thrift includes */
#include "shared_types.h"

/* custom thrift includes */

/* begin types */

enum _Operation {
  OPERATION_ADD = 1,
  OPERATION_SUBTRACT = 2,
  OPERATION_MULTIPLY = 3,
  OPERATION_DIVIDE = 4
};
typedef enum _Operation Operation;

/* return the name of the constant */
const char *
toString_Operation(int value); 

typedef gint32 MyInteger;

/* struct Work */
struct _Work
{ 
  ThriftStruct parent; 

  /* public */
  gint32 num1;
  gboolean __isset_num1;
  gint32 num2;
  gboolean __isset_num2;
  Operation op;
  gboolean __isset_op;
  gchar * comment;
  gboolean __isset_comment;
};
typedef struct _Work Work;

struct _WorkClass
{
  ThriftStructClass parent;
};
typedef struct _WorkClass WorkClass;

GType work_get_type (void);
#define TYPE_WORK (work_get_type())
#define WORK(obj) (G_TYPE_CHECK_INSTANCE_CAST ((obj), TYPE_WORK, Work))
#define WORK_CLASS(c) (G_TYPE_CHECK_CLASS_CAST ((c), _TYPE_WORK, WorkClass))
#define IS_WORK(obj) (G_TYPE_CHECK_INSTANCE_TYPE ((obj), TYPE_WORK))
#define IS_WORK_CLASS(c) (G_TYPE_CHECK_CLASS_TYPE ((c), TYPE_WORK))
#define WORK_GET_CLASS(obj) (G_TYPE_INSTANCE_GET_CLASS ((obj), TYPE_WORK, WorkClass))

struct _InvalidOperation
{ 
  ThriftStruct parent; 

  /* public */
  gint32 whatOp;
  gboolean __isset_whatOp;
  gchar * why;
  gboolean __isset_why;
};
typedef struct _InvalidOperation InvalidOperation;

struct _InvalidOperationClass
{
  ThriftStructClass parent;
};
typedef struct _InvalidOperationClass InvalidOperationClass;

GType invalid_operation_get_type (void);
#define TYPE_INVALID_OPERATION (invalid_operation_get_type())
#define INVALID_OPERATION(obj) (G_TYPE_CHECK_INSTANCE_CAST ((obj), TYPE_INVALID_OPERATION, InvalidOperation))
#define INVALID_OPERATION_CLASS(c) (G_TYPE_CHECK_CLASS_CAST ((c), _TYPE_INVALID_OPERATION, InvalidOperationClass))
#define IS_INVALID_OPERATION(obj) (G_TYPE_CHECK_INSTANCE_TYPE ((obj), TYPE_INVALID_OPERATION))
#define IS_INVALID_OPERATION_CLASS(c) (G_TYPE_CHECK_CLASS_TYPE ((c), TYPE_INVALID_OPERATION))
#define INVALID_OPERATION_GET_CLASS(obj) (G_TYPE_INSTANCE_GET_CLASS ((obj), TYPE_INVALID_OPERATION, InvalidOperationClass))

/* exception */
typedef enum
{
  INVALID_OPERATION_ERROR_CODE
} InvalidOperationError;

GQuark invalid_operation_error_quark (void);
#define INVALID_OPERATION_ERROR (invalid_operation_error_quark())


/* constants */
#define INT32CONSTANT 9853
#define MAPCONSTANT (mapconstant_constant())

/* struct CalculatorPingArgs */
struct _CalculatorPingArgs
{ 
  ThriftStruct parent; 

  /* public */
};
typedef struct _CalculatorPingArgs CalculatorPingArgs;

struct _CalculatorPingArgsClass
{
  ThriftStructClass parent;
};
typedef struct _CalculatorPingArgsClass CalculatorPingArgsClass;

GType calculator_ping_args_get_type (void);
#define TYPE_CALCULATOR_PING_ARGS (calculator_ping_args_get_type())
#define CALCULATOR_PING_ARGS(obj) (G_TYPE_CHECK_INSTANCE_CAST ((obj), TYPE_CALCULATOR_PING_ARGS, CalculatorPingArgs))
#define CALCULATOR_PING_ARGS_CLASS(c) (G_TYPE_CHECK_CLASS_CAST ((c), _TYPE_CALCULATOR_PING_ARGS, CalculatorPingArgsClass))
#define IS_CALCULATOR_PING_ARGS(obj) (G_TYPE_CHECK_INSTANCE_TYPE ((obj), TYPE_CALCULATOR_PING_ARGS))
#define IS_CALCULATOR_PING_ARGS_CLASS(c) (G_TYPE_CHECK_CLASS_TYPE ((c), TYPE_CALCULATOR_PING_ARGS))
#define CALCULATOR_PING_ARGS_GET_CLASS(obj) (G_TYPE_INSTANCE_GET_CLASS ((obj), TYPE_CALCULATOR_PING_ARGS, CalculatorPingArgsClass))

/* struct CalculatorPingResult */
struct _CalculatorPingResult
{ 
  ThriftStruct parent; 

  /* public */
};
typedef struct _CalculatorPingResult CalculatorPingResult;

struct _CalculatorPingResultClass
{
  ThriftStructClass parent;
};
typedef struct _CalculatorPingResultClass CalculatorPingResultClass;

GType calculator_ping_result_get_type (void);
#define TYPE_CALCULATOR_PING_RESULT (calculator_ping_result_get_type())
#define CALCULATOR_PING_RESULT(obj) (G_TYPE_CHECK_INSTANCE_CAST ((obj), TYPE_CALCULATOR_PING_RESULT, CalculatorPingResult))
#define CALCULATOR_PING_RESULT_CLASS(c) (G_TYPE_CHECK_CLASS_CAST ((c), _TYPE_CALCULATOR_PING_RESULT, CalculatorPingResultClass))
#define IS_CALCULATOR_PING_RESULT(obj) (G_TYPE_CHECK_INSTANCE_TYPE ((obj), TYPE_CALCULATOR_PING_RESULT))
#define IS_CALCULATOR_PING_RESULT_CLASS(c) (G_TYPE_CHECK_CLASS_TYPE ((c), TYPE_CALCULATOR_PING_RESULT))
#define CALCULATOR_PING_RESULT_GET_CLASS(obj) (G_TYPE_INSTANCE_GET_CLASS ((obj), TYPE_CALCULATOR_PING_RESULT, CalculatorPingResultClass))

/* struct CalculatorAddArgs */
struct _CalculatorAddArgs
{ 
  ThriftStruct parent; 

  /* public */
  gint32 num1;
  gboolean __isset_num1;
  gint32 num2;
  gboolean __isset_num2;
};
typedef struct _CalculatorAddArgs CalculatorAddArgs;

struct _CalculatorAddArgsClass
{
  ThriftStructClass parent;
};
typedef struct _CalculatorAddArgsClass CalculatorAddArgsClass;

GType calculator_add_args_get_type (void);
#define TYPE_CALCULATOR_ADD_ARGS (calculator_add_args_get_type())
#define CALCULATOR_ADD_ARGS(obj) (G_TYPE_CHECK_INSTANCE_CAST ((obj), TYPE_CALCULATOR_ADD_ARGS, CalculatorAddArgs))
#define CALCULATOR_ADD_ARGS_CLASS(c) (G_TYPE_CHECK_CLASS_CAST ((c), _TYPE_CALCULATOR_ADD_ARGS, CalculatorAddArgsClass))
#define IS_CALCULATOR_ADD_ARGS(obj) (G_TYPE_CHECK_INSTANCE_TYPE ((obj), TYPE_CALCULATOR_ADD_ARGS))
#define IS_CALCULATOR_ADD_ARGS_CLASS(c) (G_TYPE_CHECK_CLASS_TYPE ((c), TYPE_CALCULATOR_ADD_ARGS))
#define CALCULATOR_ADD_ARGS_GET_CLASS(obj) (G_TYPE_INSTANCE_GET_CLASS ((obj), TYPE_CALCULATOR_ADD_ARGS, CalculatorAddArgsClass))

/* struct CalculatorAddResult */
struct _CalculatorAddResult
{ 
  ThriftStruct parent; 

  /* public */
  gint32 success;
  gboolean __isset_success;
};
typedef struct _CalculatorAddResult CalculatorAddResult;

struct _CalculatorAddResultClass
{
  ThriftStructClass parent;
};
typedef struct _CalculatorAddResultClass CalculatorAddResultClass;

GType calculator_add_result_get_type (void);
#define TYPE_CALCULATOR_ADD_RESULT (calculator_add_result_get_type())
#define CALCULATOR_ADD_RESULT(obj) (G_TYPE_CHECK_INSTANCE_CAST ((obj), TYPE_CALCULATOR_ADD_RESULT, CalculatorAddResult))
#define CALCULATOR_ADD_RESULT_CLASS(c) (G_TYPE_CHECK_CLASS_CAST ((c), _TYPE_CALCULATOR_ADD_RESULT, CalculatorAddResultClass))
#define IS_CALCULATOR_ADD_RESULT(obj) (G_TYPE_CHECK_INSTANCE_TYPE ((obj), TYPE_CALCULATOR_ADD_RESULT))
#define IS_CALCULATOR_ADD_RESULT_CLASS(c) (G_TYPE_CHECK_CLASS_TYPE ((c), TYPE_CALCULATOR_ADD_RESULT))
#define CALCULATOR_ADD_RESULT_GET_CLASS(obj) (G_TYPE_INSTANCE_GET_CLASS ((obj), TYPE_CALCULATOR_ADD_RESULT, CalculatorAddResultClass))

/* struct CalculatorCalculateArgs */
struct _CalculatorCalculateArgs
{ 
  ThriftStruct parent; 

  /* public */
  gint32 logid;
  gboolean __isset_logid;
  Work * w;
  gboolean __isset_w;
};
typedef struct _CalculatorCalculateArgs CalculatorCalculateArgs;

struct _CalculatorCalculateArgsClass
{
  ThriftStructClass parent;
};
typedef struct _CalculatorCalculateArgsClass CalculatorCalculateArgsClass;

GType calculator_calculate_args_get_type (void);
#define TYPE_CALCULATOR_CALCULATE_ARGS (calculator_calculate_args_get_type())
#define CALCULATOR_CALCULATE_ARGS(obj) (G_TYPE_CHECK_INSTANCE_CAST ((obj), TYPE_CALCULATOR_CALCULATE_ARGS, CalculatorCalculateArgs))
#define CALCULATOR_CALCULATE_ARGS_CLASS(c) (G_TYPE_CHECK_CLASS_CAST ((c), _TYPE_CALCULATOR_CALCULATE_ARGS, CalculatorCalculateArgsClass))
#define IS_CALCULATOR_CALCULATE_ARGS(obj) (G_TYPE_CHECK_INSTANCE_TYPE ((obj), TYPE_CALCULATOR_CALCULATE_ARGS))
#define IS_CALCULATOR_CALCULATE_ARGS_CLASS(c) (G_TYPE_CHECK_CLASS_TYPE ((c), TYPE_CALCULATOR_CALCULATE_ARGS))
#define CALCULATOR_CALCULATE_ARGS_GET_CLASS(obj) (G_TYPE_INSTANCE_GET_CLASS ((obj), TYPE_CALCULATOR_CALCULATE_ARGS, CalculatorCalculateArgsClass))

/* struct CalculatorCalculateResult */
struct _CalculatorCalculateResult
{ 
  ThriftStruct parent; 

  /* public */
  gint32 success;
  gboolean __isset_success;
  InvalidOperation * ouch;
  gboolean __isset_ouch;
};
typedef struct _CalculatorCalculateResult CalculatorCalculateResult;

struct _CalculatorCalculateResultClass
{
  ThriftStructClass parent;
};
typedef struct _CalculatorCalculateResultClass CalculatorCalculateResultClass;

GType calculator_calculate_result_get_type (void);
#define TYPE_CALCULATOR_CALCULATE_RESULT (calculator_calculate_result_get_type())
#define CALCULATOR_CALCULATE_RESULT(obj) (G_TYPE_CHECK_INSTANCE_CAST ((obj), TYPE_CALCULATOR_CALCULATE_RESULT, CalculatorCalculateResult))
#define CALCULATOR_CALCULATE_RESULT_CLASS(c) (G_TYPE_CHECK_CLASS_CAST ((c), _TYPE_CALCULATOR_CALCULATE_RESULT, CalculatorCalculateResultClass))
#define IS_CALCULATOR_CALCULATE_RESULT(obj) (G_TYPE_CHECK_INSTANCE_TYPE ((obj), TYPE_CALCULATOR_CALCULATE_RESULT))
#define IS_CALCULATOR_CALCULATE_RESULT_CLASS(c) (G_TYPE_CHECK_CLASS_TYPE ((c), TYPE_CALCULATOR_CALCULATE_RESULT))
#define CALCULATOR_CALCULATE_RESULT_GET_CLASS(obj) (G_TYPE_INSTANCE_GET_CLASS ((obj), TYPE_CALCULATOR_CALCULATE_RESULT, CalculatorCalculateResultClass))

/* struct CalculatorZipArgs */
struct _CalculatorZipArgs
{ 
  ThriftStruct parent; 

  /* public */
};
typedef struct _CalculatorZipArgs CalculatorZipArgs;

struct _CalculatorZipArgsClass
{
  ThriftStructClass parent;
};
typedef struct _CalculatorZipArgsClass CalculatorZipArgsClass;

GType calculator_zip_args_get_type (void);
#define TYPE_CALCULATOR_ZIP_ARGS (calculator_zip_args_get_type())
#define CALCULATOR_ZIP_ARGS(obj) (G_TYPE_CHECK_INSTANCE_CAST ((obj), TYPE_CALCULATOR_ZIP_ARGS, CalculatorZipArgs))
#define CALCULATOR_ZIP_ARGS_CLASS(c) (G_TYPE_CHECK_CLASS_CAST ((c), _TYPE_CALCULATOR_ZIP_ARGS, CalculatorZipArgsClass))
#define IS_CALCULATOR_ZIP_ARGS(obj) (G_TYPE_CHECK_INSTANCE_TYPE ((obj), TYPE_CALCULATOR_ZIP_ARGS))
#define IS_CALCULATOR_ZIP_ARGS_CLASS(c) (G_TYPE_CHECK_CLASS_TYPE ((c), TYPE_CALCULATOR_ZIP_ARGS))
#define CALCULATOR_ZIP_ARGS_GET_CLASS(obj) (G_TYPE_INSTANCE_GET_CLASS ((obj), TYPE_CALCULATOR_ZIP_ARGS, CalculatorZipArgsClass))

#endif /* TUTORIAL_TYPES_H */
