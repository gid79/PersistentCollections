package com.logicalpractice.persistentcollections;

import java.util.Arrays;

/**
 *
 */
class Util {
   
   public static boolean equals(Object lhs, Object rhs){
      return (lhs == rhs) || (lhs != null && lhs.equals(rhs));
   }

   public static int hashCode(Object o) {
      return o == null ? 1 : o.hashCode();
   }

    public static int hash(Object... values) {
        return Arrays.hashCode(values);
    }
}
