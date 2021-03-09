package ec.com.dinersclub.dddmodules.application.grpc;

import static ec.com.dinersclub.dddmodules.application.grpc.PremiosGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;


@javax.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: premio.proto")
public final class MutinyPremiosGrpc {
    private MutinyPremiosGrpc() {}

    public static MutinyPremiosStub newMutinyStub(io.grpc.Channel channel) {
        return new MutinyPremiosStub(channel);
    }

    
    public static final class MutinyPremiosStub extends io.grpc.stub.AbstractStub<MutinyPremiosStub> {
        private PremiosGrpc.PremiosStub delegateStub;

        private MutinyPremiosStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = PremiosGrpc.newStub(channel);
        }

        private MutinyPremiosStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = PremiosGrpc.newStub(channel).build(channel, callOptions);
        }

        @Override
        protected MutinyPremiosStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MutinyPremiosStub(channel, callOptions);
        }

        
        public io.smallrye.mutiny.Uni<ec.com.dinersclub.dddmodules.application.grpc.PremiosResponse> getPremios(ec.com.dinersclub.dddmodules.application.grpc.ClienteRequest request) {
            return io.quarkus.grpc.runtime.ClientCalls.oneToOne(request, delegateStub::getPremios);
        }

    }

    
    public static abstract class PremiosImplBase implements io.grpc.BindableService {


        
        public io.smallrye.mutiny.Uni<ec.com.dinersclub.dddmodules.application.grpc.PremiosResponse> getPremios(ec.com.dinersclub.dddmodules.application.grpc.ClienteRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            ec.com.dinersclub.dddmodules.application.grpc.PremiosGrpc.getGetPremiosMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            ec.com.dinersclub.dddmodules.application.grpc.ClienteRequest,
                                            ec.com.dinersclub.dddmodules.application.grpc.PremiosResponse>(
                                            this, METHODID_GET_PREMIOS)))
                    .build();
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
                    io.quarkus.grpc.runtime.ServerCalls.oneToOne((ec.com.dinersclub.dddmodules.application.grpc.ClienteRequest) request,
                            (io.grpc.stub.StreamObserver<ec.com.dinersclub.dddmodules.application.grpc.PremiosResponse>) responseObserver,
                            serviceImpl::getPremios);
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