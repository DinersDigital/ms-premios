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
    comments = "Source: premio.proto")
public final class PremioGrpc {

  private PremioGrpc() {}

  public static final String SERVICE_NAME = "grpc.Premio";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ec.com.dinersclub.dddmodules.application.grpc.PremioRequest,
      ec.com.dinersclub.dddmodules.application.grpc.PremioResponse> getCreatePremioCommandMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createPremioCommand",
      requestType = ec.com.dinersclub.dddmodules.application.grpc.PremioRequest.class,
      responseType = ec.com.dinersclub.dddmodules.application.grpc.PremioResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ec.com.dinersclub.dddmodules.application.grpc.PremioRequest,
      ec.com.dinersclub.dddmodules.application.grpc.PremioResponse> getCreatePremioCommandMethod() {
    io.grpc.MethodDescriptor<ec.com.dinersclub.dddmodules.application.grpc.PremioRequest, ec.com.dinersclub.dddmodules.application.grpc.PremioResponse> getCreatePremioCommandMethod;
    if ((getCreatePremioCommandMethod = PremioGrpc.getCreatePremioCommandMethod) == null) {
      synchronized (PremioGrpc.class) {
        if ((getCreatePremioCommandMethod = PremioGrpc.getCreatePremioCommandMethod) == null) {
          PremioGrpc.getCreatePremioCommandMethod = getCreatePremioCommandMethod =
              io.grpc.MethodDescriptor.<ec.com.dinersclub.dddmodules.application.grpc.PremioRequest, ec.com.dinersclub.dddmodules.application.grpc.PremioResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createPremioCommand"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ec.com.dinersclub.dddmodules.application.grpc.PremioRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ec.com.dinersclub.dddmodules.application.grpc.PremioResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PremioMethodDescriptorSupplier("createPremioCommand"))
              .build();
        }
      }
    }
    return getCreatePremioCommandMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PremioStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PremioStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PremioStub>() {
        @java.lang.Override
        public PremioStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PremioStub(channel, callOptions);
        }
      };
    return PremioStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PremioBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PremioBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PremioBlockingStub>() {
        @java.lang.Override
        public PremioBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PremioBlockingStub(channel, callOptions);
        }
      };
    return PremioBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PremioFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PremioFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PremioFutureStub>() {
        @java.lang.Override
        public PremioFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PremioFutureStub(channel, callOptions);
        }
      };
    return PremioFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PremioImplBase implements io.grpc.BindableService {

    /**
     */
    public void createPremioCommand(ec.com.dinersclub.dddmodules.application.grpc.PremioRequest request,
        io.grpc.stub.StreamObserver<ec.com.dinersclub.dddmodules.application.grpc.PremioResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreatePremioCommandMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreatePremioCommandMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ec.com.dinersclub.dddmodules.application.grpc.PremioRequest,
                ec.com.dinersclub.dddmodules.application.grpc.PremioResponse>(
                  this, METHODID_CREATE_PREMIO_COMMAND)))
          .build();
    }
  }

  /**
   */
  public static final class PremioStub extends io.grpc.stub.AbstractAsyncStub<PremioStub> {
    private PremioStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PremioStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PremioStub(channel, callOptions);
    }

    /**
     */
    public void createPremioCommand(ec.com.dinersclub.dddmodules.application.grpc.PremioRequest request,
        io.grpc.stub.StreamObserver<ec.com.dinersclub.dddmodules.application.grpc.PremioResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreatePremioCommandMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PremioBlockingStub extends io.grpc.stub.AbstractBlockingStub<PremioBlockingStub> {
    private PremioBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PremioBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PremioBlockingStub(channel, callOptions);
    }

    /**
     */
    public ec.com.dinersclub.dddmodules.application.grpc.PremioResponse createPremioCommand(ec.com.dinersclub.dddmodules.application.grpc.PremioRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreatePremioCommandMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PremioFutureStub extends io.grpc.stub.AbstractFutureStub<PremioFutureStub> {
    private PremioFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PremioFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PremioFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ec.com.dinersclub.dddmodules.application.grpc.PremioResponse> createPremioCommand(
        ec.com.dinersclub.dddmodules.application.grpc.PremioRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreatePremioCommandMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PREMIO_COMMAND = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PremioImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PremioImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_PREMIO_COMMAND:
          serviceImpl.createPremioCommand((ec.com.dinersclub.dddmodules.application.grpc.PremioRequest) request,
              (io.grpc.stub.StreamObserver<ec.com.dinersclub.dddmodules.application.grpc.PremioResponse>) responseObserver);
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

  private static abstract class PremioBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PremioBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ec.com.dinersclub.dddmodules.application.grpc.PremioProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Premio");
    }
  }

  private static final class PremioFileDescriptorSupplier
      extends PremioBaseDescriptorSupplier {
    PremioFileDescriptorSupplier() {}
  }

  private static final class PremioMethodDescriptorSupplier
      extends PremioBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PremioMethodDescriptorSupplier(String methodName) {
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
      synchronized (PremioGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PremioFileDescriptorSupplier())
              .addMethod(getCreatePremioCommandMethod())
              .build();
        }
      }
    }
    return result;
  }
}
