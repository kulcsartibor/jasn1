/**
 * This class file was automatically generated by jASN1 v1.8.2-SNAPSHOT (http://www.openmuc.org)
 */

package org.openmuc.jasn1.compiler.pedefinitions;

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


public class Fcp implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

	public byte[] code = null;
	public BerOctetString fileDescriptor = null;
	public BerOctetString fileID = null;
	public ApplicationIdentifier dfName = null;
	public BerOctetString lcsi = null;
	public BerOctetString securityAttributesReferenced = null;
	public BerOctetString efFileSize = null;
	public BerOctetString pinStatusTemplateDO = null;
	public BerOctetString shortEFID = null;
	public ProprietaryInfo proprietaryEFInfo = null;
	public BerOctetString linkPath = null;
	
	public Fcp() {
	}

	public Fcp(byte[] code) {
		this.code = code;
	}

	public Fcp(BerOctetString fileDescriptor, BerOctetString fileID, ApplicationIdentifier dfName, BerOctetString lcsi, BerOctetString securityAttributesReferenced, BerOctetString efFileSize, BerOctetString pinStatusTemplateDO, BerOctetString shortEFID, ProprietaryInfo proprietaryEFInfo, BerOctetString linkPath) {
		this.fileDescriptor = fileDescriptor;
		this.fileID = fileID;
		this.dfName = dfName;
		this.lcsi = lcsi;
		this.securityAttributesReferenced = securityAttributesReferenced;
		this.efFileSize = efFileSize;
		this.pinStatusTemplateDO = pinStatusTemplateDO;
		this.shortEFID = shortEFID;
		this.proprietaryEFInfo = proprietaryEFInfo;
		this.linkPath = linkPath;
	}

	public int encode(OutputStream os) throws IOException {
		return encode(os, true);
	}

	public int encode(OutputStream os, boolean withTag) throws IOException {

		if (code != null) {
			for (int i = code.length - 1; i >= 0; i--) {
				os.write(code[i]);
			}
			if (withTag) {
				return tag.encode(os) + code.length;
			}
			return code.length;
		}

		int codeLength = 0;
		if (linkPath != null) {
			codeLength += linkPath.encode(os, false);
			// write tag: PRIVATE_CLASS, PRIMITIVE, 7
			os.write(0xC7);
			codeLength += 1;
		}
		
		if (proprietaryEFInfo != null) {
			codeLength += proprietaryEFInfo.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 5
			os.write(0xA5);
			codeLength += 1;
		}
		
		if (shortEFID != null) {
			codeLength += shortEFID.encode(os, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 8
			os.write(0x88);
			codeLength += 1;
		}
		
		if (pinStatusTemplateDO != null) {
			codeLength += pinStatusTemplateDO.encode(os, false);
			// write tag: PRIVATE_CLASS, PRIMITIVE, 6
			os.write(0xC6);
			codeLength += 1;
		}
		
		if (efFileSize != null) {
			codeLength += efFileSize.encode(os, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 0
			os.write(0x80);
			codeLength += 1;
		}
		
		if (securityAttributesReferenced != null) {
			codeLength += securityAttributesReferenced.encode(os, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 11
			os.write(0x8B);
			codeLength += 1;
		}
		
		if (lcsi != null) {
			codeLength += lcsi.encode(os, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 10
			os.write(0x8A);
			codeLength += 1;
		}
		
		if (dfName != null) {
			codeLength += dfName.encode(os, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 4
			os.write(0x84);
			codeLength += 1;
		}
		
		if (fileID != null) {
			codeLength += fileID.encode(os, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 3
			os.write(0x83);
			codeLength += 1;
		}
		
		if (fileDescriptor != null) {
			codeLength += fileDescriptor.encode(os, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 2
			os.write(0x82);
			codeLength += 1;
		}
		
		codeLength += BerLength.encodeLength(os, codeLength);

		if (withTag) {
			codeLength += tag.encode(os);
		}

		return codeLength;

	}

	public int decode(InputStream is) throws IOException {
		return decode(is, true);
	}

	public int decode(InputStream is, boolean withTag) throws IOException {
		int codeLength = 0;
		int subCodeLength = 0;
		BerTag berTag = new BerTag();

		if (withTag) {
			codeLength += tag.decodeAndCheck(is);
		}

		BerLength length = new BerLength();
		codeLength += length.decode(is);

		int totalLength = length.val;
		if (totalLength == -1) {
			subCodeLength += berTag.decode(is);

			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 2)) {
				fileDescriptor = new BerOctetString();
				subCodeLength += fileDescriptor.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 3)) {
				fileID = new BerOctetString();
				subCodeLength += fileID.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 4)) {
				dfName = new ApplicationIdentifier();
				subCodeLength += dfName.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 10)) {
				lcsi = new BerOctetString();
				subCodeLength += lcsi.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 11)) {
				securityAttributesReferenced = new BerOctetString();
				subCodeLength += securityAttributesReferenced.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 0)) {
				efFileSize = new BerOctetString();
				subCodeLength += efFileSize.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.PRIVATE_CLASS, BerTag.PRIMITIVE, 6)) {
				pinStatusTemplateDO = new BerOctetString();
				subCodeLength += pinStatusTemplateDO.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 8)) {
				shortEFID = new BerOctetString();
				subCodeLength += shortEFID.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 5)) {
				proprietaryEFInfo = new ProprietaryInfo();
				subCodeLength += proprietaryEFInfo.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.PRIVATE_CLASS, BerTag.PRIMITIVE, 7)) {
				linkPath = new BerOctetString();
				subCodeLength += linkPath.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			int nextByte = is.read();
			if (berTag.tagNumber != 0 || berTag.tagClass != 0 || berTag.primitive != 0
			|| nextByte != 0) {
				if (nextByte == -1) {
					throw new EOFException("Unexpected end of input stream.");
				}
				throw new IOException("Decoded sequence has wrong end of contents octets");
			}
			codeLength += subCodeLength + 1;
			return codeLength;
		}

		codeLength += totalLength;

		if (totalLength == 0) {
			return codeLength;
		}
		subCodeLength += berTag.decode(is);
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 2)) {
			fileDescriptor = new BerOctetString();
			subCodeLength += fileDescriptor.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 3)) {
			fileID = new BerOctetString();
			subCodeLength += fileID.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 4)) {
			dfName = new ApplicationIdentifier();
			subCodeLength += dfName.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 10)) {
			lcsi = new BerOctetString();
			subCodeLength += lcsi.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 11)) {
			securityAttributesReferenced = new BerOctetString();
			subCodeLength += securityAttributesReferenced.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 0)) {
			efFileSize = new BerOctetString();
			subCodeLength += efFileSize.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.PRIVATE_CLASS, BerTag.PRIMITIVE, 6)) {
			pinStatusTemplateDO = new BerOctetString();
			subCodeLength += pinStatusTemplateDO.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 8)) {
			shortEFID = new BerOctetString();
			subCodeLength += shortEFID.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 5)) {
			proprietaryEFInfo = new ProprietaryInfo();
			subCodeLength += proprietaryEFInfo.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.PRIVATE_CLASS, BerTag.PRIMITIVE, 7)) {
			linkPath = new BerOctetString();
			subCodeLength += linkPath.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
		}
		throw new IOException("Unexpected end of sequence, length tag: " + totalLength + ", actual sequence length: " + subCodeLength);

		
	}

	public void encodeAndSave(int encodingSizeGuess) throws IOException {
		OutputStream os = new BerByteArrayOutputStream(encodingSizeGuess);
		encode(os, false);
		code = ((BerByteArrayOutputStream) os).getArray();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		appendAsString(sb, 0);
		return sb.toString();
	}

	public void appendAsString(StringBuilder sb, int indentLevel) {

		sb.append("{");
		boolean firstSelectedElement = true;
		if (fileDescriptor != null) {
			sb.append("\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("fileDescriptor: ").append(fileDescriptor);
			firstSelectedElement = false;
		}
		
		if (fileID != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("fileID: ").append(fileID);
			firstSelectedElement = false;
		}
		
		if (dfName != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("dfName: ").append(dfName);
			firstSelectedElement = false;
		}
		
		if (lcsi != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("lcsi: ").append(lcsi);
			firstSelectedElement = false;
		}
		
		if (securityAttributesReferenced != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("securityAttributesReferenced: ").append(securityAttributesReferenced);
			firstSelectedElement = false;
		}
		
		if (efFileSize != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("efFileSize: ").append(efFileSize);
			firstSelectedElement = false;
		}
		
		if (pinStatusTemplateDO != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("pinStatusTemplateDO: ").append(pinStatusTemplateDO);
			firstSelectedElement = false;
		}
		
		if (shortEFID != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("shortEFID: ").append(shortEFID);
			firstSelectedElement = false;
		}
		
		if (proprietaryEFInfo != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("proprietaryEFInfo: ");
			proprietaryEFInfo.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (linkPath != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("linkPath: ").append(linkPath);
			firstSelectedElement = false;
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}

