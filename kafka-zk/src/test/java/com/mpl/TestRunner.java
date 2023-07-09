package com.mpl;

import java.util.concurrent.CompletableFuture;

public class TestRunner {

  public static void main(String[] args) {
    CompletableFuture<String> name = CompletableFuture.supplyAsync(() -> "bipin");

    name.whenCompleteAsync((n, ex) -> System.out.println(n));

    System.out.println(name.isCancelled());
    System.out.println(name.isCompletedExceptionally());
    System.out.println(name.isDone());
  }
}
