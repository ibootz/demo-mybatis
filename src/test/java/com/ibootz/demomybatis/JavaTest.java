package com.ibootz.demomybatis;

import java.util.stream.Stream;

/**
 * TODO
 *
 * @author zhangq
 * @since 2020/3/27 15:04
 */
public class JavaTest {

  public static void main(String[] args) {
    Stream.of(1, 2, 3, 4, 5).takeWhile(i -> i < 3).forEach(System.out::println);
  }
}
