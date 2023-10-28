package org.myProj.module4.completableFutureRealization;

import java.util.concurrent.CompletableFuture;

class Foo {

    CompletableFuture<Void> first() {
        return CompletableFuture.runAsync(() -> System.out.println("===>>> first method"));
    }

    CompletableFuture<Void> second() {
        return CompletableFuture.runAsync(() -> System.out.println("===>>> second method"));
    }

    CompletableFuture<Void> third() {
        return CompletableFuture.runAsync(() -> System.out.println("===>>> third method"));
    }

}
