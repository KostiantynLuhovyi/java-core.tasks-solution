package com.lugowoy.tasks.determinePeriodOfDecimalFractionForFirstTwoPositiveIntegersLocatedInRow;

import com.lugowoy.helper.models.arrays.Array;

/** Created by Konstantin Lugowoy on 03.09.2017. */

public interface Determinator {

    void determine(Array<Integer> array);

    static void determinePeriodOfDecimalFractionForFirstTwoPositiveIntegersLocatedInRow(Array<Integer> array) {
        long p, q, r, l, t, i;
        for (int n = 0; n < array.getArray().length - 1; n++) {
            if (array.getArray().length < 2) {
                break;
            } else if ((array.getArray()[n] >= 0) && (array.getArray()[n + 1] >= 0)) {
                p = array.getArray()[n];
                q = array.getArray()[n + 1];
                r = p;
                for (i = 0; i < q; i++) {
                    r = (r * 10) % q;
                }
                t = r;
                l = 0;
                do {
                    r = (r * 10) % q;
                    l++;
                } while (r != t);
                t = r = p;
                System.out.print("\nПериод десятичной дроби p = m/n для "
                        + "первых двух целых положительных чисел n и m, "
                        + "расположенных подряд: 0.");
                for (i = 0; i < l; i++) {
                    r = (r * 10) % q;
                }
                for (i = 0; r != t; i++) {
                    System.out.print(t * 10 / q);
                    r = (r * 10) % q;
                    t = (t * 10) % q;
                }
                System.out.print('(');
                for (i = 0; i < l; i++) {
                    System.out.print(t * 10 / q);
                    t = (t * 10) % q;
                }

                System.out.println(')' + " = " + p + "/" + q);
                break;
            }
        }
    }

}
