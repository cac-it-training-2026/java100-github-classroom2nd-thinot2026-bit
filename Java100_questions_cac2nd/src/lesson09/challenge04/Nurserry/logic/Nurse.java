package lesson09.challenge04.Nurserry.logic;

import lesson09.challenge04.Nurserry.Exception.CriticalConditionException;

public class Nurse {
	private String name;

	public Nurse(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//ここに適切な処理を記述
	/**
	 * 園児の体温を計測し、38度以上の場合は例外を投げます。
	 * @param child 検温対象の園児
	 * @throws CriticalConditionException 体温が38度以上の場合に発生
	 */

	public void takeTemperature(NurserySchoolChild child)
			throws CriticalConditionException {
		if (child.getTemperature() >= 38) {
			//38度以上ならメッセージを表示し、例外をインスタンス化して投げる
			System.out.println("\n" + child.getName() + "は重体です。");
			throw new CriticalConditionException();
		} else {// 38度未満なら体温を表示する
			System.out.println("\n" + child.getName() + "の体温は"
					+ child.getTemperature() + "度です。");
		}
	}
}
