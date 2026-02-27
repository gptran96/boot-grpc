package vn.com.ironman.service;

import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Service;
import vn.com.ironman.proto.HelloRequest;
import vn.com.ironman.proto.HelloResponse;
import vn.com.ironman.proto.SimpleServiceGrpc;

@Service
public class MyGrpcService extends SimpleServiceGrpc.SimpleServiceImplBase {

    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        String greeting = "Hello, " + request.getName();
        HelloResponse response = HelloResponse.newBuilder()
                .setMessage(greeting)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}