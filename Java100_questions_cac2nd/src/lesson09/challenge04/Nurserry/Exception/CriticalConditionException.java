package lesson09.challenge04.Nurserry.Exception;

/**
 * 園児の体調が深刻な状態であることを表す例外クラス
 */
public class CriticalConditionException extends Exception {
	// 基本的には継承するだけで独自例外として機能
	public CriticalConditionException() {
		super();
	}
}