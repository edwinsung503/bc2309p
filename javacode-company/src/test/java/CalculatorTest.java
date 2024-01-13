import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import com.bootcamp.javacode.model.Calculators;
import com.bootcamp.javacode.model.RealCalculator;

@ExtendWith(MockitoExtension.class)
public class CalculatorTest {
  
  @Mock //假
  private Calculators calculator; // new ??
  //Create a mock Object for the dependency
  //因為Mock 左就會有個object assign 左上去, new calculator, 唔使自已new a object
  
  //@InjectMocks means calling the constructor  "RealCalculator(Calculators calculator) "
  //by passing @Mock calculator
  @InjectMocks
  private RealCalculator realCalculator;// this.realCalculator

  @Test
  void testCalculateMethod(){
    // when someone call "calculator.addition(10,5)", assume return 3 always
    Mockito.when(calculator.addition(10, 5)).thenReturn(3);

    //Call the targeted test method
    RealCalculator realCalculator = new RealCalculator(calculator);

    // actually call calculator.addition(10,5)

    assertThat(realCalculator.calculate(10), is(17)); // 3 + p + 4 = 17
    // 一把假的野, 提供theme work 俾你去試某功能去試野
    
    //Another Case
    Mockito.when(calculator.addition(82,41)).thenReturn(1000);
    assertThat(realCalculator.calculate(82), is(1086)); // 1000 + p + 4 = 1086

    //
    
  }

  @Test
  void testSleep() {
    Mockito.when(calculator.addition(20,10)).thenReturn(150);
    RealCalculator realCalculator = new RealCalculator(calculator);
    assertThat(realCalculator.sleep(20), is(170));// 150 + 20 = 170 

    //Verifty How many times & what input parameters passd to call sleep method
    Mockito.verify(calculator, times(1)).addition(20,10);
    Mockito.verify(calculator, times(0)).addition(20,20);
  }

  @Test
  void testSleep2() {
    Mockito.when(calculator.addition(50, 25)).thenReturn(2);
    assertThat(this.realCalculator.sleep(50),is(22));// 22 + 2
  }


}
