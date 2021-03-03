package ec.com.dinersclub.dddmodules.application.grpc;

import static ec.com.dinersclub.dddmodules.application.grpc.PremioGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;


@javax.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: premio.proto")
public final class MutinyPremioGrpc {
    private MutinyPremioGrpc() {}

    public static MutinyPremioStub newMutinyStub(io.grpc.Channel channel) {
        return new MutinyPremioStub(channel);
    }

    
    public static final class MutinyPremioStub extends io.grpc.stub.AbstractStub<MutinyPremioStub> {
        private PremioGrpc.PremioStub delegateStub;

        private MutinyPremioStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = PremioGrpc.newStub(channel);
        }

        private MutinyPremioStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = PremioGrpc.newStub(channel).build(channel, callOptions);
        }

        @Override
        protected MutinyPremioStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MutinyPremioStub(channel, callOptions);
        }

        
        public io.smallrye.mutiny.Uni<ec.com.dinersclub.dddmodules.application.grpc.PremioResponse> createPremioCommand(ec.com.dinersclub.dddmodules.application.grpc.PremioRequest request) {
            return io.quarkus.grpc.runtime.ClientCalls.oneToOne(request, delegateStub::createPremioCommand);
        }

    }

    
    public static abstract class PremioImplBase implements io.grpc.BindableService {


        
        public io.smallrye.mutiny.Uni<ec.com.dinersclub.dddmodules.application.grpc.PremioResponse> createPremioCommand(ec.com.dinersclub.dddmodules.application.grpc.PremioRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            ec.com.dinersclub.dddmodules.application.grpc.PremioGrpc.getCreatePremioCommandMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            ec.com.dinersclub.dddmodules.application.grpc.PremioRequest,
                                            ec.com.dinersclub.dddmodules.application.grpc.PremioResponse>(
                                            this, METHODID_CREATE_PREMIO_COMMAND)))
                    .build();
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
                    io.quarkus.grpc.runtime.ServerCalls.oneToOne((ec.com.dinersclub.dddmodules.application.grpc.PremioRequest) request,
                            (io.grpc.stub.StreamObserver<ec.com.dinersclub.dddmodules.application.grpc.PremioResponse>) responseObserver,
                            serviceImpl::createPremioCommand);
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