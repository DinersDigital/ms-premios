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
    comments = "Source: tarjeta.proto")
public final class TarjetaGrpc {

  private TarjetaGrpc() {}

  public static final String SERVICE_NAME = "grpc.Tarjeta";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ec.com.dinersclub.dddmodules.application.grpc.TarjetaRequest,
      ec.com.dinersclub.dddmodules.application.grpc.TarjetaResponse> getCreateTarjetaCommandMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createTarjetaCommand",
      requestType = ec.com.dinersclub.dddmodules.application.grpc.TarjetaRequest.class,
      responseType = ec.com.dinersclub.dddmodules.application.grpc.TarjetaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ec.com.dinersclub.dddmodules.application.grpc.TarjetaRequest,
      ec.com.dinersclub.dddmodules.application.grpc.TarjetaResponse> getCreateTarjetaCommandMethod() {
    io.grpc.MethodDescriptor<ec.com.dinersclub.dddmodules.application.grpc.TarjetaRequest, ec.com.dinersclub.dddmodules.application.grpc.TarjetaResponse> getCreateTarjetaCommandMethod;
    if ((getCreateTarjetaCommandMethod = TarjetaGrpc.getCreateTarjetaCommandMethod) == null) {
      synchronized (TarjetaGrpc.class) {
        if ((getCreateTarjetaCommandMethod = TarjetaGrpc.getCreateTarjetaCommandMethod) == null) {
          TarjetaGrpc.getCreateTarjetaCommandMethod = getCreateTarjetaCommandMethod =
              io.grpc.MethodDescriptor.<ec.com.dinersclub.dddmodules.application.grpc.TarjetaRequest, ec.com.dinersclub.dddmodules.application.grpc.TarjetaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createTarjetaCommand"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ec.com.dinersclub.dddmodules.application.grpc.TarjetaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ec.com.dinersclub.dddmodules.application.grpc.TarjetaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TarjetaMethodDescriptorSupplier("createTarjetaCommand"))
              .build();
        }
      }
    }
    return getCreateTarjetaCommandMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TarjetaStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TarjetaStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TarjetaStub>() {
        @java.lang.Override
        public TarjetaStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TarjetaStub(channel, callOptions);
        }
      };
    return TarjetaStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TarjetaBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TarjetaBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TarjetaBlockingStub>() {
        @java.lang.Override
        public TarjetaBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TarjetaBlockingStub(channel, callOptions);
        }
      };
    return TarjetaBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TarjetaFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TarjetaFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TarjetaFutureStub>() {
        @java.lang.Override
        public TarjetaFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TarjetaFutureStub(channel, callOptions);
        }
      };
    return TarjetaFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TarjetaImplBase implements io.grpc.BindableService {

    /**
     */
    public void createTarjetaCommand(ec.com.dinersclub.dddmodules.application.grpc.TarjetaRequest request,
        io.grpc.stub.StreamObserver<ec.com.dinersclub.dddmodules.application.grpc.TarjetaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateTarjetaCommandMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateTarjetaCommandMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ec.com.dinersclub.dddmodules.application.grpc.TarjetaRequest,
                ec.com.dinersclub.dddmodules.application.grpc.TarjetaResponse>(
                  this, METHODID_CREATE_TARJETA_COMMAND)))
          .build();
    }
  }

  /**
   */
  public static final class TarjetaStub extends io.grpc.stub.AbstractAsyncStub<TarjetaStub> {
    private TarjetaStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TarjetaStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TarjetaStub(channel, callOptions);
    }

    /**
     */
    public void createTarjetaCommand(ec.com.dinersclub.dddmodules.application.grpc.TarjetaRequest request,
        io.grpc.stub.StreamObserver<ec.com.dinersclub.dddmodules.application.grpc.TarjetaResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateTarjetaCommandMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TarjetaBlockingStub extends io.grpc.stub.AbstractBlockingStub<TarjetaBlockingStub> {
    private TarjetaBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TarjetaBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TarjetaBlockingStub(channel, callOptions);
    }

    /**
     */
    public ec.com.dinersclub.dddmodules.application.grpc.TarjetaResponse createTarjetaCommand(ec.com.dinersclub.dddmodules.application.grpc.TarjetaRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateTarjetaCommandMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TarjetaFutureStub extends io.grpc.stub.AbstractFutureStub<TarjetaFutureStub> {
    private TarjetaFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TarjetaFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TarjetaFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ec.com.dinersclub.dddmodules.application.grpc.TarjetaResponse> createTarjetaCommand(
        ec.com.dinersclub.dddmodules.application.grpc.TarjetaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateTarjetaCommandMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_TARJETA_COMMAND = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TarjetaImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TarjetaImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_TARJETA_COMMAND:
          serviceImpl.createTarjetaCommand((ec.com.dinersclub.dddmodules.application.grpc.TarjetaRequest) request,
              (io.grpc.stub.StreamObserver<ec.com.dinersclub.dddmodules.application.grpc.TarjetaResponse>) responseObserver);
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

  private static abstract class TarjetaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TarjetaBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ec.com.dinersclub.dddmodules.application.grpc.TarjetaProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Tarjeta");
    }
  }

  private static final class TarjetaFileDescriptorSupplier
      extends TarjetaBaseDescriptorSupplier {
    TarjetaFileDescriptorSupplier() {}
  }

  private static final class TarjetaMethodDescriptorSupplier
      extends TarjetaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TarjetaMethodDescriptorSupplier(String methodName) {
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
      synchronized (TarjetaGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TarjetaFileDescriptorSupplier())
              .addMethod(getCreateTarjetaCommandMethod())
              .build();
        }
      }
    }
    return result;
  }
}
