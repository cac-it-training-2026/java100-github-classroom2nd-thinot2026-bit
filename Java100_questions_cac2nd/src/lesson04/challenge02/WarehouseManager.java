/**
 * 第4章 倉庫番のお仕事
 *
 * 問題2  倉庫管理の基礎②
 *
 * XO商事に入社して2日目を迎えたYさん。
 * 研修は徐々に難しくなります。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  Z先輩：
 *  それではこれより新人研修の第2回目を始めます。
 *
 *  Yさん：
 *  はい、よろしくお願いします。
 *
 *  Z先輩：
 *  今回の研修では、配列の要素を予め決めておくことはせず、
 *  お客様のご要望にお答えする形にします。
 *
 *  Yさん：
 *  はい、わかりました。
 *
 *  Z先輩：
 *  あ、お客様がご来店だ!
 *
 *  Z先輩：
 *  いらっしゃいませ、ご要望をどうぞ。
 *
 *  データ型を選んでください（1...文字、2...文字列、3...数値）＞○
 *
 *  要素数を選んでください（1...1個、2...2個、3...3個）＞○
 *
 *  Z先輩：
 *  中に入れる値はおまかせという事でよろしいですね。
 *  ご注文を承りました。
 *
 *  Z先輩：
 *  Yさん、作成をお願いしてもいいかな？
 *
 *  Yさん：
 *  はい、作成させていただきます。
 *
 *  Yさん：
 *  ...出来ました。
 *
 *  Z先輩：
 *  試しに最後の値を見せてください。
 *
 *  Yさん：
 *  【※ここに値を出力】です。
 *
 *  Z先輩：
 *  はい、ありがとう。ちゃんと出来てますね。
 *
 *
 * <範囲外の数値を入力された場合の実行例>
 *
 *  Z先輩：
 *  そのような選択肢はありません。
 *
 */

package lesson04.challenge02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WarehouseManager {

	public static void main(String[] args) throws IOException {

		System.out.println("Z先輩：");
		System.out.println("それではこれより新人研修の第2回目を始めます。\n");
		System.out.println("Yさん：");
		System.out.println("はい、よろしくお願いします。\n");

		System.out.println("Z先輩：");
		System.out.println("今回の研修では、配列の要素を予め決めておくことはせず、");
		System.out.println("お客様のご要望にお答えする形にします。\n");

		System.out.println("Yさん：");
		System.out.println("はい,わかりました。\n");

		System.out.println("Z先輩：");
		System.out.println("あ、お客様がご来店だ!\n");

		System.out.println("Z先輩：");
		System.out.println("いらっしゃいませ、ご要望をどうぞ。\n");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// ユーザーからの入力を数値として取得
		System.out.print("データ型を選んでください（1...文字、2...文字列、3...数値）＞");
		int type = Integer.parseInt(br.readLine());

		System.out.print("\n要素数を選んでください（1...1個、2...2個、3...3個）＞");
		int size = Integer.parseInt(br.readLine());

		boolean errFlag = false;

		// 範囲チェック範囲チェック (入力値が1〜3以外ならエラー)
		if (type < 1 || type > 3 || size < 1 || size > 3) {
			errFlag = true;
		}

		if (!errFlag) {
			System.out.println("\nZ先輩：");
			System.out.println("中に入れる値はおまかせという事でよろしいですね。");
			System.out.println("ご注文を承りました。\n");

			System.out.println("Z先輩：");
			System.out.println("Yさん、作成をお願いしてもいいかな？\n");

			System.out.println("Yさん：");
			System.out.println("はい、作成させていただきます。\n");
			// 配列の宣言 (まだ実体は作らず、参照変数だけ用意)
			char[] charArray = null;
			String[] strArray = null;
			int[] intArray = null;

			// 選択された型に合わせて配列を「new」で生成
			if (type == 1) {
				charArray = new char[size];// 指定されたsizeで生成
				for (int i = 0; i < size; i++) {
					charArray[i] = (char) ('a' + i);// a, b, c...と代入
				}
			} else if (type == 2) {
				strArray = new String[size];
				String[] sample = { "abc", "def", "ghi" };
				for (int i = 0; i < size; i++) {
					strArray[i] = sample[i];
				}
			} else if (type == 3) {
				intArray = new int[size];
				for (int i = 0; i < size; i++) {
					intArray[i] = i + 1;// 1, 2, 3...と代入
				}
			}

			System.out.println("Yさん：");
			System.out.println("...出来ました。\n");

			System.out.println("Z先輩：");
			System.out.println("試しに最後の値を見せてください。\n");

			System.out.println("Yさん：");

			// 最後の要素を表示
			// 配列の添字（インデックス）は 0 から始まるため、
			// 要素数が 3 の場合、最後の添字は 2 (size - 1) になります。
			if (type == 1) {
				System.out.print(charArray[size - 1]);
			} else if (type == 2) {
				System.out.print(strArray[size - 1]);
			} else if (type == 3) {
				System.out.print(intArray[size - 1]);
			}

			System.out.println("です。\n");

			System.out.println("Z先輩：");
			System.out.println("はい、ありがとう。ちゃんと出来てますね。\n");

		} else {
			System.out.println("\nZ先輩：");
			System.out.println("そのような選択肢はありません。");
		}
	}
}