package ec.com.dinersclub.dddmodules.application.grpc;

import static ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;


@javax.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: consumo.proto")
public final class MutinyConsumosRegistradosGrpc {
    private MutinyConsumosRegistradosGrpc() {}

    public static MutinyConsumosRegistradosStub newMutinyStub(io.grpc.Channel channel) {
        return new MutinyConsumosRegistradosStub(channel);
    }

    
    public static final class MutinyConsumosRegistradosStub extends io.grpc.stub.AbstractStub<MutinyConsumosRegistradosStub> {
        private ConsumosRegistradosGrpc.ConsumosRegistradosStub delegateStub;

        private MutinyConsumosRegistradosStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = ConsumosRegistradosGrpc.newStub(channel);
        }

        private MutinyConsumosRegistradosStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = ConsumosRegistradosGrpc.newStub(channel).build(channel, callOptions);
        }

        @Override
        protected MutinyConsumosRegistradosStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MutinyConsumosRegistradosStub(channel, callOptions);
        }

        
        public io.smallrye.mutiny.Uni<ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse> verificarConsumosRegistradosCliente(ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosRequest request) {
            return io.quarkus.grpc.runtime.ClientCalls.oneToOne(request, delegateStub::verificarConsumosRegistradosCliente);
        }

    }

    
    public static abstract class ConsumosRegistradosImplBase implements io.grpc.BindableService {


        
        public io.smallrye.mutiny.Uni<ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse> verificarConsumosRegistradosCliente(ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosGrpc.getVerificarConsumosRegistradosClienteMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosRequest,
                                            ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse>(
                                            this, METHODID_VERIFICAR_CONSUMOS_REGISTRADOS_CLIENTE)))
                    .build();
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
                    io.quarkus.grpc.runtime.ServerCalls.oneToOne((ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosRequest) request,
                            (io.grpc.stub.StreamObserver<ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse>) responseObserver,
                            serviceImpl::verificarConsumosRegistradosCliente);
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