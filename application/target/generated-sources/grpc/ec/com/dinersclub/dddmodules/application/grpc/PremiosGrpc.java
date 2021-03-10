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
public final class PremiosGrpc {

  private PremiosGrpc() {}

  public static final String SERVICE_NAME = "grpc.Premios";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ec.com.dinersclub.dddmodules.application.grpc.ClienteRequest,
      ec.com.dinersclub.dddmodules.application.grpc.PremiosResponse> getGetPremiosMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPremios",
      requestType = ec.com.dinersclub.dddmodules.application.grpc.ClienteRequest.class,
      responseType = ec.com.dinersclub.dddmodules.application.grpc.PremiosResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ec.com.dinersclub.dddmodules.application.grpc.ClienteRequest,
      ec.com.dinersclub.dddmodules.application.grpc.PremiosResponse> getGetPremiosMethod() {
    io.grpc.MethodDescriptor<ec.com.dinersclub.dddmodules.application.grpc.ClienteRequest, ec.com.dinersclub.dddmodules.application.grpc.PremiosResponse> getGetPremiosMethod;
    if ((getGetPremiosMethod = PremiosGrpc.getGetPremiosMethod) == null) {
      synchronized (PremiosGrpc.class) {
        if ((getGetPremiosMethod = PremiosGrpc.getGetPremiosMethod) == null) {
          PremiosGrpc.getGetPremiosMethod = getGetPremiosMethod =
              io.grpc.MethodDescriptor.<ec.com.dinersclub.dddmodules.application.grpc.ClienteRequest, ec.com.dinersclub.dddmodules.application.grpc.PremiosResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getPremios"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ec.com.dinersclub.dddmodules.application.grpc.ClienteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ec.com.dinersclub.dddmodules.application.grpc.PremiosResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PremiosMethodDescriptorSupplier("getPremios"))
              .build();
        }
      }
    }
    return getGetPremiosMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PremiosStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PremiosStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PremiosStub>() {
        @java.lang.Override
        public PremiosStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PremiosStub(channel, callOptions);
        }
      };
    return PremiosStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PremiosBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PremiosBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PremiosBlockingStub>() {
        @java.lang.Override
        public PremiosBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PremiosBlockingStub(channel, callOptions);
        }
      };
    return PremiosBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PremiosFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PremiosFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PremiosFutureStub>() {
        @java.lang.Override
        public PremiosFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PremiosFutureStub(channel, callOptions);
        }
      };
    return PremiosFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PremiosImplBase implements io.grpc.BindableService {

    /**
     */
    public void getPremios(ec.com.dinersclub.dddmodules.application.grpc.ClienteRequest request,
        io.grpc.stub.StreamObserver<ec.com.dinersclub.dddmodules.application.grpc.PremiosResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPremiosMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetPremiosMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ec.com.dinersclub.dddmodules.application.grpc.ClienteRequest,
                ec.com.dinersclub.dddmodules.application.grpc.PremiosResponse>(
                  this, METHODID_GET_PREMIOS)))
          .build();
    }
  }

  /**
   */
  public static final class PremiosStub extends io.grpc.stub.AbstractAsyncStub<PremiosStub> {
    private PremiosStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PremiosStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PremiosStub(channel, callOptions);
    }

    /**
     */
    public void getPremios(ec.com.dinersclub.dddmodules.application.grpc.ClienteRequest request,
        io.grpc.stub.StreamObserver<ec.com.dinersclub.dddmodules.application.grpc.PremiosResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPremiosMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PremiosBlockingStub extends io.grpc.stub.AbstractBlockingStub<PremiosBlockingStub> {
    private PremiosBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PremiosBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PremiosBlockingStub(channel, callOptions);
    }

    /**
     */
    public ec.com.dinersclub.dddmodules.application.grpc.PremiosResponse getPremios(ec.com.dinersclub.dddmodules.application.grpc.ClienteRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPremiosMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PremiosFutureStub extends io.grpc.stub.AbstractFutureStub<PremiosFutureStub> {
    private PremiosFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PremiosFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PremiosFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ec.com.dinersclub.dddmodules.application.grpc.PremiosResponse> getPremios(
        ec.com.dinersclub.dddmodules.application.grpc.ClienteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPremiosMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PREMIOS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PremiosImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PremiosImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PREMIOS:
          serviceImpl.getPremios((ec.com.dinersclub.dddmodules.application.grpc.ClienteRequest) request,
              (io.grpc.stub.StreamObserver<ec.com.dinersclub.dddmodules.application.grpc.PremiosResponse>) responseObserver);
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

  private static abstract class PremiosBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PremiosBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ec.com.dinersclub.dddmodules.application.grpc.PremioProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Premios");
    }
  }

  private static final class PremiosFileDescriptorSupplier
      extends PremiosBaseDescriptorSupplier {
    PremiosFileDescriptorSupplier() {}
  }

  private static final class PremiosMethodDescriptorSupplier
      extends PremiosBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PremiosMethodDescriptorSupplier(String methodName) {
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
      synchronized (PremiosGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PremiosFileDescriptorSupplier())
              .addMethod(getGetPremiosMethod())
              .build();
        }
      }
    }
    return result;
  }
}
