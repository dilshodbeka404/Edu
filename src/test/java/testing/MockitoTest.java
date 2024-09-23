package testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class MockitoTest {

    private MathTesting mathTestingMock;

    @BeforeEach
    public void setup() {
        mathTestingMock = mock(MathTesting.class);
    }

    @Test
    void addNums() {
        when(mathTestingMock.add(1, 1)).thenReturn(4);
//        assertEquals(mathTestingMock.add(1, 1), 3);
    }
}
