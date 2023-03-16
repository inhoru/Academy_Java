package com.bs.example.practice5.model.vo;

public class Lotto {

	private int[] lotto;

	{

		lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}

			}
		}
	}

	public Lotto() {}


	public int[] getLotto() {
		return lotto;
	}

	public void setLotto(int[] lotto) {
		this.lotto = lotto;
	}
	
	public void infomation() {
		for (int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i]);
			
		}
	}

}
