/* 
 * Copyright 2019 Manu Portolés Zagalá.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */
package org.japo.java.main;

import java.util.Calendar;
import java.util.Random;

/**
 *
 * @author Manu Portolés Zagalá
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static final Random RND = new Random();

    public static void main(String[] args) {

        final int H_INI = 8;
        final int M_INI = 20;
        final int S_INI = 0;

        Calendar cal = Calendar.getInstance();

        int horaAct = cal.get(Calendar.HOUR_OF_DAY);
        int minAct = cal.get(Calendar.MINUTE);
        int segAct = cal.get(Calendar.SECOND);

        int tiempoIni = H_INI * 3600 + M_INI * 60 + S_INI;
        int tiempoAct = horaAct * 3600 + minAct * 60 + S_INI;
        int tiempoRnd = RND.nextInt(tiempoAct - tiempoIni + 1) + tiempoIni;
        int tiempoDis = tiempoAct - tiempoRnd;

        int hRnd = tiempoRnd / 3600;
        tiempoRnd = tiempoRnd % 3600;
        int mRnd = tiempoRnd / 60;
        int sRnd = tiempoRnd % 60;

        int hDis = tiempoDis / 3600;
        tiempoDis = tiempoDis / 3600;
        int mDis = tiempoDis / 60;
        int sDis = tiempoDis % 60;

        System.out.printf("%s %02d:%02d:%02d%n", "Hora actual ......:", horaAct, minAct, segAct);
        System.out.printf("%s %02d:%02d:%02d%n", "Hora inicio ......:", hRnd, mRnd, sRnd);
        System.out.printf("%s %2d:%02d:%02d%n", "Tiempo de clase ..:", hDis, mDis, sDis);
    }

}
