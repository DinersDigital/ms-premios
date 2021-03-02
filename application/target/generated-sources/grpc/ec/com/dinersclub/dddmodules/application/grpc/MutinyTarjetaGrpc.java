package ec.com.dinersclub.dddmodules.application.grpc;

import static ec.com.dinersclub.dddmodules.application.grpc.TarjetaGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;


@javax.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: tarjeta.proto")
public final class MutinyTarjetaGrpc {
    private MutinyTarjetaGrpc() {}

    public static MutinyTarjetaStub newMutinyStub(io.grpc.Channel channel) {
        return new MutinyTarjetaStub(channel);
    }

    
    public static final class MutinyTarjetaStub extends io.grpc.stub.AbstractStub<MutinyTarjetaStub> {
        private TarjetaGrpc.TarjetaStub delegateStub;

        private MutinyTarjetaStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = TarjetaGrpc.newStub(channel);
        }

        private MutinyTarjetaStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = TarjetaGrpc.newStub(channel).build(channel, callOptions);
        }

        @Override
        protected MutinyTarjetaStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MutinyTarjetaStub(channel, callOptions);
        }

        
        public io.smallrye.mutiny.Uni<ec.com.dinersclub.dddmodules.application.grpc.TarjetaResponse> createTarjetaCommand(ec.com.dinersclub.dddmodules.application.grpc.TarjetaRequest request) {
            return io.quarkus.grpc.runtime.ClientCalls.oneToOne(request, delegateStub::createTarjetaCommand);
        }

    }

    
    public static abstract class TarjetaImplBase implements io.grpc.BindableService {


        
        public io.smallrye.mutiny.Uni<ec.com.dinersclub.dddmodules.application.grpc.TarjetaResponse> createTarjetaCommand(ec.com.dinersclub.dddmodules.application.grpc.TarjetaRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            ec.com.dinersclub.dddmodules.application.grpc.TarjetaGrpc.getCreateTarjetaCommandMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            ec.com.dinersclub.dddmodules.application.grpc.TarjetaRequest,
                                            ec.com.dinersclub.dddmodules.application.grpc.TarjetaResponse>(
                                            this, METHODID_CREATE_TARJETA_COMMAND)))
                    .build();
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
                    io.quarkus.grpc.runtime.ServerCalls.oneToOne((ec.com.dinersclub.dddmodules.application.grpc.TarjetaRequest) request,
                            (io.grpc.stub.StreamObserver<ec.com.dinersclub.dddmodules.application.grpc.TarjetaResponse>) responseObserver,
                            serviceImpl::createTarjetaCommand);
                    break;
                default:
                    throw new java.lang.AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                default:
                    throw new java.lang.AssertionError();
            }
        }
    }

}