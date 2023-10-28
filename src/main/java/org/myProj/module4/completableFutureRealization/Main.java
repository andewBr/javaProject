package org.myProj.module4.completableFutureRealization;

import java.util.concurrent.CompletableFuture;

class Main {

    public static void main(String[] args) {
        Foo foo = new Foo();

        CompletableFuture<Void> first = foo.first();
        CompletableFuture<Void> second = foo.second();
        CompletableFuture<Void> third = foo.third();

        CompletableFuture<Void> combinedFuture = CompletableFuture.allOf(first, second, third);

        combinedFuture.thenRun(() -> System.out.println("All operations completed"));
    }

}
