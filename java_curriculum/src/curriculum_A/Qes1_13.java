package curriculum_A;

public class Qes1_13 {
    // メンバ変数をクラスのメンバ変数として宣言
    static byte byteVar = 10;
    static short shortVar = 100;
    static int intVar = 1000;
    static long longVar = 10000;
    static float floatVar = 9.5f;
    static double doubleVar = 10.5;
    static char charVar = 'a';
    static String stringVar = "ハロー";
    static boolean boolVar = true;

    public static void main(String[] args) {

        // 小数点以外の数字を足した結果
        long sum1 = intVar + shortVar + longVar + byteVar;
        System.out.println(sum1 + "\t\t" + sum1);

        // byte変数同士を足した結果
        int product1 = byteVar + byteVar;
        System.out.println(product1 + "\t\t" + product1);

        // 数字以外の文字列を足した結果
        System.out.println(charVar + " " + stringVar + " " + boolVar + "\t\t" + charVar + " " + stringVar + " " + boolVar);

        // 小数点以外の数字を足した結果
        int sum2 = (int) (sum1 + product1);
        System.out.println(sum2 + "\t\t" + sum2);

        // 小数点以外の数字を掛けた結果
        long product2 = byteVar * shortVar * intVar * longVar;
        System.out.println(product2 + "\t\t" + product2);

        // 10.5割る100をした結果
        float division = (float) doubleVar / 100;
        System.out.println(division + "\t\t" + division);

        // 10引く100をした結果
        int subtraction = byteVar - shortVar;
        System.out.println(subtraction + "\t\t" + subtraction);

        // 新しい変数を追加して連続して使用
        String num = "20";
        int num1 = 23;

        // 文字列を整数に変換してから加算し、結果を文字列に変換
        String result = "ハローJAVA" + (Integer.parseInt(num) + num1);

        // 出力: ハローJAVA43
        System.out.println(result);

        // 『山田太郎 18歳 170.5cm 62.2kg 寿司』の情報をローカル変数に代入
        String personInfo = "山田太郎 18歳 170.5cm 62.2kg 寿司";
        String[] infoArray = personInfo.split(" ");
        String name = infoArray[0];
        int age = Integer.parseInt(infoArray[1].replace("歳", ""));
        double height = Double.parseDouble(infoArray[2].replace("cm", ""));
        double weight = Double.parseDouble(infoArray[3].replace("kg", ""));
        String favoriteFood = infoArray[4];

        double bmi = weight / ((height / 100) * (height / 100));

        // 名前を鈴木一郎に変更
        name = "鈴木一郎";
        // 年齢・身長・体重の数値を和算で自己代入
        age += 30;      // 現在の年齢に30を加える
        height += 166.5; // 現在の身長に166.5を加える
        weight += 66.2; // 現在の体重に66.2を加える
        favoriteFood = "オムライス";
        bmi = weight / ((height / 100) * (height / 100));
        String personalInfo = "年齢は" + String.valueOf(age) + "歳、身長は" + String.valueOf(height) + "cm、体重は" + String.valueOf(weight) + "kg";
        System.out.println(personalInfo);

        // 年齢・身長を文字列から整数に変換して出力
        int convertedAge = Integer.parseInt(String.valueOf(age));
        int convertedHeight = (int) Double.parseDouble(String.valueOf(height));  // 身長がdouble型の場合はint型に変換
        System.out.println(convertedAge);
        System.out.println(convertedHeight);

        // 年齢が25歳以上または身長が160cm以上ならtrueを出力
        boolean conditionMet = (convertedAge >= 25) || (convertedHeight >= 160);
        System.out.println(conditionMet);

        // 出力フォーマットに基づいてコンソールに出力
        System.out.format(
                "「初めまして%sです」"
                + "「年齢は%d歳です」"
                + "「身長は%.1fcmです」"
                + "「体重%.1fkgです」"
                + "「好きな食べ物は%sです」"
                + "「BMIは%.2fです」"
                + "\n", name, age, height, weight, favoriteFood, bmi);

        // 年齢が25歳以上ならtrueが出力される
        System.out.println(age >= 25);
    }
}
