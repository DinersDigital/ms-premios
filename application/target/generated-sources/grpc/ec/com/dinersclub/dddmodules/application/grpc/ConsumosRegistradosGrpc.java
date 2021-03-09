package ec.com.dinersclub.dddmodules.application.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.34.0)",
    comments = "Source: consumo.proto")
public final class ConsumosRegistradosGrpc {

  private ConsumosRegistradosGrpc() {}

  public static final String SERVICE_NAME = "grpc.ConsumosRegistrados";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosRequest,
      ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse> getVerificarConsumosRegistradosClienteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "verificarConsumosRegistradosCliente",
      requestType = ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosRequest.class,
      responseType = ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosRequest,
      ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse> getVerificarConsumosRegistradosClienteMethod() {
    io.grpc.MethodDescriptor<ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosRequest, ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse> getVerificarConsumosRegistradosClienteMethod;
    if ((getVerificarConsumosRegistradosClienteMethod = ConsumosRegistradosGrpc.getVerificarConsumosRegistradosClienteMethod) == null) {
      synchronized (ConsumosRegistradosGrpc.class) {
        if ((getVerificarConsumosRegistradosClienteMethod = ConsumosRegistradosGrpc.getVerificarConsumosRegistradosClienteMethod) == null) {
          ConsumosRegistradosGrpc.getVerificarConsumosRegistradosClienteMethod = getVerificarConsumosRegistradosClienteMethod =
              io.grpc.MethodDescriptor.<ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosRequest, ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "verificarConsumosRegistradosCliente"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConsumosRegistradosMethodDescriptorSupplier("verificarConsumosRegistradosCliente"))
              .build();
        }
      }
    }
    return getVerificarConsumosRegistradosClienteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ConsumosRegistradosStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConsumosRegistradosStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConsumosRegistradosStub>() {
        @java.lang.Override
        public ConsumosRegistradosStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConsumosRegistradosStub(channel, callOptions);
        }
      };
    return ConsumosRegistradosStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConsumosRegistradosBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConsumosRegistradosBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConsumosRegistradosBlockingStub>() {
        @java.lang.Override
        public ConsumosRegistradosBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConsumosRegistradosBlockingStub(channel, callOptions);
        }
      };
    return ConsumosRegistradosBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ConsumosRegistradosFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConsumosRegistradosFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConsumosRegistradosFutureStub>() {
        @java.lang.Override
        public ConsumosRegistradosFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConsumosRegistradosFutureStub(channel, callOptions);
        }
      };
    return ConsumosRegistradosFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ConsumosRegistradosImplBase implements io.grpc.BindableService {

    /**
     */
    public void verificarConsumosRegistradosCliente(ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosRequest request,
        io.grpc.stub.StreamObserver<ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getVerificarConsumosRegistradosClienteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getVerificarConsumosRegistradosClienteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosRequest,
                ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse>(
                  this, METHODID_VERIFICAR_CONSUMOS_REGISTRADOS_CLIENTE)))
          .build();
    }
  }

  /**
   */
  public static final class ConsumosRegistradosStub extends io.grpc.stub.AbstractAsyncStub<ConsumosRegistradosStub> {
    private ConsumosRegistradosStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConsumosRegistradosStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConsumosRegistradosStub(channel, callOptions);
    }

    /**
     */
    public void verificarConsumosRegistradosCliente(ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosRequest request,
        io.grpc.stub.StreamObserver<ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVerificarConsumosRegistradosClienteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ConsumosRegistradosBlockingStub extends io.grpc.stub.AbstractBlockingStub<ConsumosRegistradosBlockingStub> {
    private ConsumosRegistradosBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConsumosRegistradosBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConsumosRegistradosBlockingStub(channel, callOptions);
    }

    /**
     */
    public ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse verificarConsumosRegistradosCliente(ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosRequest request) {
      return blockingUnaryCall(
          getChannel(), getVerificarConsumosRegistradosClienteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ConsumosRegistradosFutureStub extends io.grpc.stub.AbstractFutureStub<ConsumosRegistradosFutureStub> {
    private ConsumosRegistradosFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConsumosRegistradosFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConsumosRegistradosFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse> verificarConsumosRegistradosCliente(
        ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getVerificarConsumosRegistradosClienteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_VERIFICAR_CONSUMOS_REGISTRADOS_CLIENTE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ConsumosRegistradosImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ConsumosRegistradosImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_VERIFICAR_CONSUMOS_REGISTRADOS_CLIENTE:
          serviceImpl.verificarConsumosRegistradosCliente((ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosRequest) request,
              (io.grpc.stub.StreamObserver<ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ConsumosRegistradosBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConsumosRegistradosBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ec.com.dinersclub.dddmodules.application.grpc.ConsumoProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ConsumosRegistrados");
    }
  }

  private static final class ConsumosRegistradosFileDescriptorSupplier
      extends ConsumosRegistradosBaseDescriptorSupplier {
    ConsumosRegistradosFileDescriptorSupplier() {}
  }

  private static final class ConsumosRegistradosMethodDescriptorSupplier
      extends ConsumosRegistradosBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ConsumosRegistradosMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ConsumosRegistradosGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ConsumosRegistradosFileDescriptorSupplier())
              .addMethod(getVerificarConsumosRegistradosClienteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
