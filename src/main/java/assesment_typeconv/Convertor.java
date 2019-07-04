/*
 * Copyright (c) 2019-present unTill Pro, Ltd. and Contributors
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */


package assesment_typeconv;

	public static Cracked crack(int value) {
		int a = value / 32767;
		int b = value % 32767;
		return new Cracked((short) a, (short) b);
	}

	public static int uncrack(Cracked cracked) {
		return cracked.getA() * 32767 + cracked.getB();
	}
}