package main.java.comohgiraffers.section02.string;

import java.util.Locale;

public class Application {
    public static void main(String[] args) {

        /*
         * charAt() : 해당 문자열의 특정 인덱스에 해당하는 문자를 반환
         * 인덱스는 0 부터 시작하는 숫자 체계를 의미하며,
         * 인덱스를 벗어난 정수를 인자로 전달하는 경우에는
         * IndexOutofBoundExceptoin이 발생한다. //오류
         *
         *
         */
        String str1 = "apple";

        for (int i = 0; i < str1.length(); i++) {
            System.out.print(str1.charAt(i));
        }


        /*
         compareTo() 인자로 전달된 문자열과 사전 순으로 비교하여 두 문자열이 같다면 0을 반환
         인자로 전달된 문자열보다 작으면 음수를,크면 양수를 반환한다.
         단,이메소드는 대소문자를 구분하여 비교한다.
         */

        String str2 = "java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "oracle";

        System.out.println("compareTo()" + (str2.compareTo(str3)));
        System.out.println("compareTo()" + (str2.compareTo(str4)));
        System.out.println("compareTo()" + (str2.compareTo(str5)));

        /*
         *
         * concat() : 문자열에 인자로 전달된 문자열을 합쳐 새로운
         * 문자열을 반환한다. 원본에는 영향을 주지 않는다ㅣ.
         */
        System.out.println("comcat()" + (str2.concat(str5)));
        System.out.println(str2);

        /*
         * indexOf() : 문자열에서 특정 문자를 탐색하여
         * 처음 일치하는 인덱스 위치를 정수형을 반환한다.
         * 단, 일치하는 문자가 없는 경우 -1을 반환한다.
         */

        String indexOf = "java oracle";

        System.out.println(indexOf.indexOf("v"));
        System.out.println(indexOf.indexOf("z"));

        /*
        lastIndexOf() 가장뒤에있는 같은 인덱스반환

         */
        System.out.println(indexOf.lastIndexOf("z"));
        System.out.println(indexOf.lastIndexOf("a"));

        //trim() : 문자열의 앞 뒤 공백 제거 후 반환
        String trinStr = "    java    ";
        System.out.println("trinStr : #" + trinStr);
        System.out.println("trinStr : #" + trinStr.trim());

        /*
         * toLowerCase() : 모든 문자 소문자 변환
         * toUpperCase() : 모든 문자 대문자 변환
         * 원본에는 영향을 주지않는다
         *
         */
        String caseStr = "JavaOracle";
        System.out.println(caseStr.toLowerCase());
        System.out.println(caseStr.toUpperCase());

        /*
         subString() : 문자열의 일부분을 잘라내어 새로운 문자열 반환
         원본에는 영향을 주지 않는다.

         */
        String JavaOracle = "JavaOracle";

        System.out.println(JavaOracle.substring(3));
        System.out.println(JavaOracle.substring(3,6));

        /*
        replace() : 문자열에서 대체할 문자열로 기존 문자열을 변경해서 반환
        원본에 영향을 주지 않는데
         */
        System.out.println(JavaOracle.replace("Java","python"));

        /*
        * isEmpty() : 문자열의 길이가 0이면 true 아니면 false 반환
         */
        System.out.println("isEmpty()" +"".isEmpty());
        System.out.println("isEmpty()" +" 11".isEmpty());
    }
}
