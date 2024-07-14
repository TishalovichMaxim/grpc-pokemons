package by.tishalovichm.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.65.0)",
    comments = "Source: PokemonService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PokemonServiceGrpc {

  private PokemonServiceGrpc() {}

  public static final String SERVICE_NAME = "PokemonService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<PokemonServiceOuterClass.PokemonRequest,
      PokemonServiceOuterClass.PokemonResponse> getGetPokemonMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPokemon",
      requestType = PokemonServiceOuterClass.PokemonRequest.class,
      responseType = PokemonServiceOuterClass.PokemonResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<PokemonServiceOuterClass.PokemonRequest,
      PokemonServiceOuterClass.PokemonResponse> getGetPokemonMethod() {
    io.grpc.MethodDescriptor<PokemonServiceOuterClass.PokemonRequest, PokemonServiceOuterClass.PokemonResponse> getGetPokemonMethod;
    if ((getGetPokemonMethod = PokemonServiceGrpc.getGetPokemonMethod) == null) {
      synchronized (PokemonServiceGrpc.class) {
        if ((getGetPokemonMethod = PokemonServiceGrpc.getGetPokemonMethod) == null) {
          PokemonServiceGrpc.getGetPokemonMethod = getGetPokemonMethod =
              io.grpc.MethodDescriptor.<PokemonServiceOuterClass.PokemonRequest, PokemonServiceOuterClass.PokemonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPokemon"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PokemonServiceOuterClass.PokemonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PokemonServiceOuterClass.PokemonResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PokemonServiceMethodDescriptorSupplier("GetPokemon"))
              .build();
        }
      }
    }
    return getGetPokemonMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PokemonServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PokemonServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PokemonServiceStub>() {
        @Override
        public PokemonServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PokemonServiceStub(channel, callOptions);
        }
      };
    return PokemonServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PokemonServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PokemonServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PokemonServiceBlockingStub>() {
        @Override
        public PokemonServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PokemonServiceBlockingStub(channel, callOptions);
        }
      };
    return PokemonServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PokemonServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PokemonServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PokemonServiceFutureStub>() {
        @Override
        public PokemonServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PokemonServiceFutureStub(channel, callOptions);
        }
      };
    return PokemonServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getPokemon(PokemonServiceOuterClass.PokemonRequest request,
                            io.grpc.stub.StreamObserver<PokemonServiceOuterClass.PokemonResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPokemonMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PokemonService.
   */
  public static abstract class PokemonServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return PokemonServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PokemonService.
   */
  public static final class PokemonServiceStub
      extends io.grpc.stub.AbstractAsyncStub<PokemonServiceStub> {
    private PokemonServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected PokemonServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PokemonServiceStub(channel, callOptions);
    }

    /**
     */
    public void getPokemon(PokemonServiceOuterClass.PokemonRequest request,
                           io.grpc.stub.StreamObserver<PokemonServiceOuterClass.PokemonResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPokemonMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PokemonService.
   */
  public static final class PokemonServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PokemonServiceBlockingStub> {
    private PokemonServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected PokemonServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PokemonServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public PokemonServiceOuterClass.PokemonResponse getPokemon(PokemonServiceOuterClass.PokemonRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPokemonMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PokemonService.
   */
  public static final class PokemonServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<PokemonServiceFutureStub> {
    private PokemonServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected PokemonServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PokemonServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<PokemonServiceOuterClass.PokemonResponse> getPokemon(
        PokemonServiceOuterClass.PokemonRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPokemonMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_POKEMON = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_POKEMON:
          serviceImpl.getPokemon((PokemonServiceOuterClass.PokemonRequest) request,
              (io.grpc.stub.StreamObserver<PokemonServiceOuterClass.PokemonResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetPokemonMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              PokemonServiceOuterClass.PokemonRequest,
              PokemonServiceOuterClass.PokemonResponse>(
                service, METHODID_GET_POKEMON)))
        .build();
  }

  private static abstract class PokemonServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PokemonServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return PokemonServiceOuterClass.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PokemonService");
    }
  }

  private static final class PokemonServiceFileDescriptorSupplier
      extends PokemonServiceBaseDescriptorSupplier {
    PokemonServiceFileDescriptorSupplier() {}
  }

  private static final class PokemonServiceMethodDescriptorSupplier
      extends PokemonServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PokemonServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PokemonServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PokemonServiceFileDescriptorSupplier())
              .addMethod(getGetPokemonMethod())
              .build();
        }
      }
    }
    return result;
  }
}
