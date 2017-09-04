/**
 * This class file was automatically generated by jASN1 v1.8.2-SNAPSHOT (http://www.openmuc.org)
 */

package org.openmuc.jasn1.compiler.tagging_test;

import java.io.IOException;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.io.Serializable;
import org.openmuc.jasn1.ber.*;
import org.openmuc.jasn1.ber.types.*;
import org.openmuc.jasn1.ber.types.string.*;


public class UntaggedChoice implements Serializable {

	private static final long serialVersionUID = 1L;

	public byte[] code = null;
	private BerInteger myInteger = null;
	private BerBoolean myBoolean = null;
	
	public UntaggedChoice() {
	}

	public UntaggedChoice(byte[] code) {
		this.code = code;
	}

	public void setMyInteger(BerInteger myInteger) {
		this.myInteger = myInteger;
	}

	public BerInteger getMyInteger() {
		return myInteger;
	}

	public void setMyBoolean(BerBoolean myBoolean) {
		this.myBoolean = myBoolean;
	}

	public BerBoolean getMyBoolean() {
		return myBoolean;
	}

	public int encode(OutputStream os) throws IOException {

		if (code != null) {
			for (int i = code.length - 1; i >= 0; i--) {
				os.write(code[i]);
			}
			return code.length;
		}

		int codeLength = 0;
		if (myBoolean != null) {
			codeLength += myBoolean.encode(os, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 4
			os.write(0x84);
			codeLength += 1;
			return codeLength;
		}
		
		if (myInteger != null) {
			codeLength += myInteger.encode(os, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 3
			os.write(0x83);
			codeLength += 1;
			return codeLength;
		}
		
		throw new IOException("Error encoding CHOICE: No element of CHOICE was selected.");
	}

	public int decode(InputStream is) throws IOException {
		return decode(is, null);
	}

	public int decode(InputStream is, BerTag berTag) throws IOException {

		int codeLength = 0;
		BerTag passedTag = berTag;

		if (berTag == null) {
			berTag = new BerTag();
			codeLength += berTag.decode(is);
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 3)) {
			myInteger = new BerInteger();
			codeLength += myInteger.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 4)) {
			myBoolean = new BerBoolean();
			codeLength += myBoolean.decode(is, false);
			return codeLength;
		}

		if (passedTag != null) {
			return 0;
		}

		throw new IOException("Error decoding CHOICE: Tag " + berTag + " matched to no item.");
	}

	public void encodeAndSave(int encodingSizeGuess) throws IOException {
		OutputStream os = new BerByteArrayOutputStream(encodingSizeGuess);
		encode(os);
		code = ((BerByteArrayOutputStream) os).getArray();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		appendAsString(sb, 0);
		return sb.toString();
	}

	public void appendAsString(StringBuilder sb, int indentLevel) {

		if (myInteger != null) {
			sb.append("myInteger: ").append(myInteger);
			return;
		}

		if (myBoolean != null) {
			sb.append("myBoolean: ").append(myBoolean);
			return;
		}

		sb.append("<none>");
	}

}

