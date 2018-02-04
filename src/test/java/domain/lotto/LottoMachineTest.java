package domain.lotto;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class LottoMachineTest {

    private LottoMachine lottoMachine;

    @Before
    public void init() {
        lottoMachine = LottoMachine.of(14000, input.inputManualBuyNumber());
    }

    @Test
    public void InputMoney() {
        assertThat(lottoMachine.getMoney(), is(14000));
    }

}




