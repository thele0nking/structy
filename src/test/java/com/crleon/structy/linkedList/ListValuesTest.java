package com.crleon.structy.linkedList;

import com.crleon.structy.common.Node;
import java.util.Arrays;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ListValuesTest {

  @Parameterized.Parameters
  public static Collection input() {
    Node a = new Node(1);
    return Arrays.asList(new Object[][] {
        {}
    });
  }

}
