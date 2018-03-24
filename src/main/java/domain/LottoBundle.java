package domain;

import dto.LottoResult;

import java.util.List;

public class LottoBundle {
    private List<Lotto> bundleLotto;

    public LottoBundle(int amount) {
        if (LottoMachine.isImPossibleBuy(amount)) {
            throw new IllegalArgumentException("돈이 부족하여 구매할 수 없습니다.");
        }
        bundleLotto = buyLotto(amount);
    }

    private static List<Lotto> buyLotto(int amount) {
        LottoMachine machine = LottoMachine.of();
        return machine.publishLotto(amount);
    }

    public LottoResult matchLotto(Lotto winningNumber) {

        return null;
    }
}
