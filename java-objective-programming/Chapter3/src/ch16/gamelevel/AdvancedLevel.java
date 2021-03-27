package ch16.gamelevel;

public class AdvancedLevel implements PlayerLevel {

	@Override
	public void run() {
		System.out.println("빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("높이 jump 합니다.");
	}

	@Override
	public void turn() {
		System.out.println("turn 못해요!");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*** 중급자 레벨입니다 ***");
	}

}
