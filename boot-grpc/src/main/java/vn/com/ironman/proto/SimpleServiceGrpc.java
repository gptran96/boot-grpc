package vn.com.ironman.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class SimpleServiceGrpc {

  private SimpleServiceGrpc() {}

  public static final String SERVICE_NAME = "SimpleService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<HelloRequest,
      HelloResponse> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = HelloRequest.class,
      responseType = HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<HelloRequest,
      HelloResponse> getSayHelloMethod() {
    io.grpc.MethodDescriptor<HelloRequest, HelloResponse> getSayHelloMethod;
    if ((getSayHelloMethod = SimpleServiceGrpc.getSayHelloMethod) == null) {
      synchronized (SimpleServiceGrpc.class) {
        if ((getSayHelloMethod = SimpleServiceGrpc.getSayHelloMethod) == null) {
          SimpleServiceGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<HelloRequest, HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SimpleServiceMethodDescriptorSupplier("SayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SimpleServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SimpleServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SimpleServiceStub>() {
        @Override
        public SimpleServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SimpleServiceStub(channel, callOptions);
        }
      };
    return SimpleServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static SimpleServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SimpleServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SimpleServiceBlockingV2Stub>() {
        @Override
        public SimpleServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SimpleServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return SimpleServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SimpleServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SimpleServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SimpleServiceBlockingStub>() {
        @Override
        public SimpleServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SimpleServiceBlockingStub(channel, callOptions);
        }
      };
    return SimpleServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SimpleServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SimpleServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SimpleServiceFutureStub>() {
        @Override
        public SimpleServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SimpleServiceFutureStub(channel, callOptions);
        }
      };
    return SimpleServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void sayHello(HelloRequest request,
                          io.grpc.stub.StreamObserver<HelloResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SimpleService.
   */
  public static abstract class SimpleServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return SimpleServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SimpleService.
   */
  public static final class SimpleServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SimpleServiceStub> {
    private SimpleServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SimpleServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SimpleServiceStub(channel, callOptions);
    }

    /**
     */
    public void sayHello(HelloRequest request,
                         io.grpc.stub.StreamObserver<HelloResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SimpleService.
   */
  public static final class SimpleServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<SimpleServiceBlockingV2Stub> {
    private SimpleServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SimpleServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SimpleServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public HelloResponse sayHello(HelloRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service SimpleService.
   */
  public static final class SimpleServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SimpleServiceBlockingStub> {
    private SimpleServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SimpleServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SimpleServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public HelloResponse sayHello(HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SimpleService.
   */
  public static final class SimpleServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SimpleServiceFutureStub> {
    private SimpleServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SimpleServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SimpleServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<HelloResponse> sayHello(
        HelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;

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
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((HelloRequest) request,
              (io.grpc.stub.StreamObserver<HelloResponse>) responseObserver);
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
          getSayHelloMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              HelloRequest,
              HelloResponse>(
                service, METHODID_SAY_HELLO)))
        .build();
  }

  private static abstract class SimpleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SimpleServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Hello.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SimpleService");
    }
  }

  private static final class SimpleServiceFileDescriptorSupplier
      extends SimpleServiceBaseDescriptorSupplier {
    SimpleServiceFileDescriptorSupplier() {}
  }

  private static final class SimpleServiceMethodDescriptorSupplier
      extends SimpleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SimpleServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SimpleServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SimpleServiceFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
