/*
 * Copyright (c) 2019-present unTill Pro, Ltd. and Contributors
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package assesment_typeconv;

import org.junit.Test;
import static org.junit.Assert.fail;

public class ConvertorTest {
	
	@Test
	public void givenNull_whenCrackUncrack_thenNull() {
		int expected = 0;
		int actual = Convertor.uncrack(Convertor.crack(0));
		assertEquals(expected, actual);
	}

	@Test
	public void givenNumber_whenCrackUncrack_thenSameNumber() {
		int expected = 12345;
		int actual = Convertor.uncrack(Convertor.crack(12345));
		assertEquals(expected, actual);
	}

	@Test
	public void givenBigNumber_whenCrackUncrack_thenSameNumber() {
		int expected = 214748364;
		int actual = Convertor.uncrack(Convertor.crack(214748364));
		assertEquals(expected, actual);
	}

	@Test
	public void givenNegativeNumber_whenCrackUncrack_thenSameNegativeNumber() {
		int expected = -56789;
		int actual = Convertor.uncrack(Convertor.crack(-56789));
		assertEquals(expected, actual);
	}
}