/**
 * 第6章 宇宙飛行士のお仕事
 *
 * 問題10 Stringクラス②（length、subString）
 *
 * 宇宙船が次の目的地β星に到着しました。
 * β星は不思議な星です。β星人たちは
 * 自分の持物を必ず5文字以内で表記します。
 * 例えば、「apple」は「apple」のまま使いますが、
 * 「orange」は「orang」に変更して使います。
 *
 * β星人クラスBetalianを新たに作成してください。
 * BetalianはString型フィールドitemを持ち、
 * メソッドsetItem()で登録します。setItem()は
 * 5文字以上ある名前については、6文字目以降を削ってから
 * itemに登録します。
 *
 * <実行例>
 *
 * β星人にアイテムを渡してください＞orange
 *
 * β星人：
 * ありがとうベータ！
 * このorang大事にするベータ。
 *
 */

package lesson06.challenge10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//ここにBetalianクラスを記述する
class Betalian {
	// フィールド：外部から直接書き換えられないように private に設定（カプセル化）
	private String item;

	// ゲッター：保持しているアイテムを安全に外部へ渡すメソッド
	public String getItem() {
		return item;
	}

	// セッター：アイテムを受け取るメソッド。ここに「5文字制限」のルールがある
	public void setItem(String item) {
		if (item.length() > 5) {

			// substring(開始位置, 終了位置) を使って、0〜4文字目（合計5文字）だけを抽出
			item = item.substring(0, 5);
		}
		// 加工（またはそのまま）した値をフィールドに代入
		this.item = item;
	}
}

public class Astronaut {

	public static void main(String[] args) throws IOException {

		System.out.print("β星人にアイテムを渡してください＞");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String present = br.readLine();

		//ここに適切な処理を記述する

		// 1. β星人オブジェクトを生成
		Betalian betalian = new Betalian();
		// 2. セッターを通じてアイテムを渡す（ここで5文字制限の処理が走る）
		betalian.setItem(present);

		String item = null;

		//ここに適切な処理を記述する
		// 3. ゲッターを使って、β星人が実際に持っているアイテムを確認する
		item = betalian.getItem();

		System.out.println("\nβ星人：");
		System.out.println("ありがとうベータ！");
		System.out.println("この" + item + "大事にするベータ。");
	}
}
