/**
 * This class file was automatically generated by jASN1 v1.9.0 (http://www.openmuc.org)
 */

package org.openmuc.jasn1.compiler.iso8823_presentation;

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


public class CPType implements Serializable {

	private static final long serialVersionUID = 1L;

	public static class NormalModeParameters implements Serializable {

		private static final long serialVersionUID = 1L;

		public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

		public byte[] code = null;
		public ProtocolVersion protocolVersion = null;
		public CallingPresentationSelector callingPresentationSelector = null;
		public CalledPresentationSelector calledPresentationSelector = null;
		public PresentationContextDefinitionList presentationContextDefinitionList = null;
		public DefaultContextName defaultContextName = null;
		public PresentationRequirements presentationRequirements = null;
		public UserSessionRequirements userSessionRequirements = null;
		public UserData userData = null;
		
		public NormalModeParameters() {
		}

		public NormalModeParameters(byte[] code) {
			this.code = code;
		}

		public NormalModeParameters(ProtocolVersion protocolVersion, CallingPresentationSelector callingPresentationSelector, CalledPresentationSelector calledPresentationSelector, PresentationContextDefinitionList presentationContextDefinitionList, DefaultContextName defaultContextName, PresentationRequirements presentationRequirements, UserSessionRequirements userSessionRequirements, UserData userData) {
			this.protocolVersion = protocolVersion;
			this.callingPresentationSelector = callingPresentationSelector;
			this.calledPresentationSelector = calledPresentationSelector;
			this.presentationContextDefinitionList = presentationContextDefinitionList;
			this.defaultContextName = defaultContextName;
			this.presentationRequirements = presentationRequirements;
			this.userSessionRequirements = userSessionRequirements;
			this.userData = userData;
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
			if (userData != null) {
				codeLength += userData.encode(os);
			}
			
			if (userSessionRequirements != null) {
				codeLength += userSessionRequirements.encode(os, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 9
				os.write(0x89);
				codeLength += 1;
			}
			
			if (presentationRequirements != null) {
				codeLength += presentationRequirements.encode(os, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 8
				os.write(0x88);
				codeLength += 1;
			}
			
			if (defaultContextName != null) {
				codeLength += defaultContextName.encode(os, false);
				// write tag: CONTEXT_CLASS, CONSTRUCTED, 6
				os.write(0xA6);
				codeLength += 1;
			}
			
			if (presentationContextDefinitionList != null) {
				codeLength += presentationContextDefinitionList.encode(os, false);
				// write tag: CONTEXT_CLASS, CONSTRUCTED, 4
				os.write(0xA4);
				codeLength += 1;
			}
			
			if (calledPresentationSelector != null) {
				codeLength += calledPresentationSelector.encode(os, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 2
				os.write(0x82);
				codeLength += 1;
			}
			
			if (callingPresentationSelector != null) {
				codeLength += callingPresentationSelector.encode(os, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 1
				os.write(0x81);
				codeLength += 1;
			}
			
			if (protocolVersion != null) {
				codeLength += protocolVersion.encode(os, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 0
				os.write(0x80);
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
				if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 0)) {
					protocolVersion = new ProtocolVersion();
					subCodeLength += protocolVersion.decode(is, false);
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
				if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
					callingPresentationSelector = new CallingPresentationSelector();
					subCodeLength += callingPresentationSelector.decode(is, false);
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
				if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 2)) {
					calledPresentationSelector = new CalledPresentationSelector();
					subCodeLength += calledPresentationSelector.decode(is, false);
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
				if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 4)) {
					presentationContextDefinitionList = new PresentationContextDefinitionList();
					subCodeLength += presentationContextDefinitionList.decode(is, false);
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
				if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 6)) {
					defaultContextName = new DefaultContextName();
					subCodeLength += defaultContextName.decode(is, false);
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
					presentationRequirements = new PresentationRequirements();
					subCodeLength += presentationRequirements.decode(is, false);
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
				if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 9)) {
					userSessionRequirements = new UserSessionRequirements();
					subCodeLength += userSessionRequirements.decode(is, false);
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
				userData = new UserData();
				int choiceDecodeLength = userData.decode(is, berTag);
				if (choiceDecodeLength != 0) {
					subCodeLength += choiceDecodeLength;
					subCodeLength += berTag.decode(is);
				}
				else {
					userData = null;
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
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 0)) {
				protocolVersion = new ProtocolVersion();
				subCodeLength += protocolVersion.decode(is, false);
				if (subCodeLength == totalLength) {
					return codeLength;
				}
				subCodeLength += berTag.decode(is);
			}
			
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
				callingPresentationSelector = new CallingPresentationSelector();
				subCodeLength += callingPresentationSelector.decode(is, false);
				if (subCodeLength == totalLength) {
					return codeLength;
				}
				subCodeLength += berTag.decode(is);
			}
			
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 2)) {
				calledPresentationSelector = new CalledPresentationSelector();
				subCodeLength += calledPresentationSelector.decode(is, false);
				if (subCodeLength == totalLength) {
					return codeLength;
				}
				subCodeLength += berTag.decode(is);
			}
			
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 4)) {
				presentationContextDefinitionList = new PresentationContextDefinitionList();
				subCodeLength += presentationContextDefinitionList.decode(is, false);
				if (subCodeLength == totalLength) {
					return codeLength;
				}
				subCodeLength += berTag.decode(is);
			}
			
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 6)) {
				defaultContextName = new DefaultContextName();
				subCodeLength += defaultContextName.decode(is, false);
				if (subCodeLength == totalLength) {
					return codeLength;
				}
				subCodeLength += berTag.decode(is);
			}
			
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 8)) {
				presentationRequirements = new PresentationRequirements();
				subCodeLength += presentationRequirements.decode(is, false);
				if (subCodeLength == totalLength) {
					return codeLength;
				}
				subCodeLength += berTag.decode(is);
			}
			
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 9)) {
				userSessionRequirements = new UserSessionRequirements();
				subCodeLength += userSessionRequirements.decode(is, false);
				if (subCodeLength == totalLength) {
					return codeLength;
				}
				subCodeLength += berTag.decode(is);
			}
			
			userData = new UserData();
			int choiceDecodeLength = userData.decode(is, berTag);
			subCodeLength += choiceDecodeLength;
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			throw new IOException("Unexpected end of sequence, length tag: " + totalLength + ", actual sequence length: " + subCodeLength);

			
		}

		public void encodeAndSave(int encodingSizeGuess) throws IOException {
			ReverseByteArrayOutputStream os = new ReverseByteArrayOutputStream(encodingSizeGuess);
			encode(os, false);
			code = os.getArray();
		}

		public String toString() {
			StringBuilder sb = new StringBuilder();
			appendAsString(sb, 0);
			return sb.toString();
		}

		public void appendAsString(StringBuilder sb, int indentLevel) {

			sb.append("{");
			boolean firstSelectedElement = true;
			if (protocolVersion != null) {
				sb.append("\n");
				for (int i = 0; i < indentLevel + 1; i++) {
					sb.append("\t");
				}
				sb.append("protocolVersion: ").append(protocolVersion);
				firstSelectedElement = false;
			}
			
			if (callingPresentationSelector != null) {
				if (!firstSelectedElement) {
					sb.append(",\n");
				}
				for (int i = 0; i < indentLevel + 1; i++) {
					sb.append("\t");
				}
				sb.append("callingPresentationSelector: ").append(callingPresentationSelector);
				firstSelectedElement = false;
			}
			
			if (calledPresentationSelector != null) {
				if (!firstSelectedElement) {
					sb.append(",\n");
				}
				for (int i = 0; i < indentLevel + 1; i++) {
					sb.append("\t");
				}
				sb.append("calledPresentationSelector: ").append(calledPresentationSelector);
				firstSelectedElement = false;
			}
			
			if (presentationContextDefinitionList != null) {
				if (!firstSelectedElement) {
					sb.append(",\n");
				}
				for (int i = 0; i < indentLevel + 1; i++) {
					sb.append("\t");
				}
				sb.append("presentationContextDefinitionList: ");
				presentationContextDefinitionList.appendAsString(sb, indentLevel + 1);
				firstSelectedElement = false;
			}
			
			if (defaultContextName != null) {
				if (!firstSelectedElement) {
					sb.append(",\n");
				}
				for (int i = 0; i < indentLevel + 1; i++) {
					sb.append("\t");
				}
				sb.append("defaultContextName: ");
				defaultContextName.appendAsString(sb, indentLevel + 1);
				firstSelectedElement = false;
			}
			
			if (presentationRequirements != null) {
				if (!firstSelectedElement) {
					sb.append(",\n");
				}
				for (int i = 0; i < indentLevel + 1; i++) {
					sb.append("\t");
				}
				sb.append("presentationRequirements: ").append(presentationRequirements);
				firstSelectedElement = false;
			}
			
			if (userSessionRequirements != null) {
				if (!firstSelectedElement) {
					sb.append(",\n");
				}
				for (int i = 0; i < indentLevel + 1; i++) {
					sb.append("\t");
				}
				sb.append("userSessionRequirements: ").append(userSessionRequirements);
				firstSelectedElement = false;
			}
			
			if (userData != null) {
				if (!firstSelectedElement) {
					sb.append(",\n");
				}
				for (int i = 0; i < indentLevel + 1; i++) {
					sb.append("\t");
				}
				sb.append("userData: ");
				userData.appendAsString(sb, indentLevel + 1);
				firstSelectedElement = false;
			}
			
			sb.append("\n");
			for (int i = 0; i < indentLevel; i++) {
				sb.append("\t");
			}
			sb.append("}");
		}

	}

	public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 17);

	public byte[] code = null;
	public ModeSelector modeSelector = null;
	public NormalModeParameters normalModeParameters = null;
	
	public CPType() {
	}

	public CPType(byte[] code) {
		this.code = code;
	}

	public CPType(ModeSelector modeSelector, NormalModeParameters normalModeParameters) {
		this.modeSelector = modeSelector;
		this.normalModeParameters = normalModeParameters;
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
		if (normalModeParameters != null) {
			codeLength += normalModeParameters.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 2
			os.write(0xA2);
			codeLength += 1;
		}
		
		codeLength += modeSelector.encode(os, false);
		// write tag: CONTEXT_CLASS, CONSTRUCTED, 0
		os.write(0xA0);
		codeLength += 1;
		
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
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 0)) {
				modeSelector = new ModeSelector();
				subCodeLength += modeSelector.decode(is, false);
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
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 2)) {
				normalModeParameters = new NormalModeParameters();
				subCodeLength += normalModeParameters.decode(is, false);
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

		while (subCodeLength < totalLength) {
			subCodeLength += berTag.decode(is);
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 0)) {
				modeSelector = new ModeSelector();
				subCodeLength += modeSelector.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 2)) {
				normalModeParameters = new NormalModeParameters();
				subCodeLength += normalModeParameters.decode(is, false);
			}
		}
		if (subCodeLength != totalLength) {
			throw new IOException("Length of set does not match length tag, length tag: " + totalLength + ", actual set length: " + subCodeLength);

		}
		codeLength += subCodeLength;

		return codeLength;
	}

	public void encodeAndSave(int encodingSizeGuess) throws IOException {
		ReverseByteArrayOutputStream os = new ReverseByteArrayOutputStream(encodingSizeGuess);
		encode(os, false);
		code = os.getArray();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		appendAsString(sb, 0);
		return sb.toString();
	}

	public void appendAsString(StringBuilder sb, int indentLevel) {

		sb.append("{");
		sb.append("\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (modeSelector != null) {
			sb.append("modeSelector: ");
			modeSelector.appendAsString(sb, indentLevel + 1);
		}
		else {
			sb.append("modeSelector: <empty-required-field>");
		}
		
		if (normalModeParameters != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("normalModeParameters: ");
			normalModeParameters.appendAsString(sb, indentLevel + 1);
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}

