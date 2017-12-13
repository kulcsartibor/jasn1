/**
 * This class file was automatically generated by jASN1 v1.9.0 (http://www.openmuc.org)
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


public class ProfileElement implements Serializable {

	private static final long serialVersionUID = 1L;

	public byte[] code = null;
	public ProfileHeader header = null;
	public PEGenericFileManagement genericFileManagement = null;
	public PEPINCodes pinCodes = null;
	public PEPUKCodes pukCodes = null;
	public PEAKAParameter akaParameter = null;
	public PECDMAParameter cdmaParameter = null;
	public PESecurityDomain securityDomain = null;
	public PERFM rfm = null;
	public PEApplication application = null;
	public PENonStandard nonStandard = null;
	public PEEnd end = null;
	public PEDummy rfu1 = null;
	public PEDummy rfu2 = null;
	public PEDummy rfu3 = null;
	public PEDummy rfu4 = null;
	public PEDummy rfu5 = null;
	public PEMF mf = null;
	public PECD cd = null;
	public PETELECOM telecom = null;
	public PEUSIM usim = null;
	public PEOPTUSIM optUsim = null;
	public PEISIM isim = null;
	public PEOPTISIM optIsim = null;
	public PEPHONEBOOK phonebook = null;
	public PEGSMACCESS gsmAccess = null;
	public PECSIM csim = null;
	public PEOPTCSIM optCsim = null;
	
	public ProfileElement() {
	}

	public ProfileElement(byte[] code) {
		this.code = code;
	}

	public ProfileElement(ProfileHeader header, PEGenericFileManagement genericFileManagement, PEPINCodes pinCodes, PEPUKCodes pukCodes, PEAKAParameter akaParameter, PECDMAParameter cdmaParameter, PESecurityDomain securityDomain, PERFM rfm, PEApplication application, PENonStandard nonStandard, PEEnd end, PEDummy rfu1, PEDummy rfu2, PEDummy rfu3, PEDummy rfu4, PEDummy rfu5, PEMF mf, PECD cd, PETELECOM telecom, PEUSIM usim, PEOPTUSIM optUsim, PEISIM isim, PEOPTISIM optIsim, PEPHONEBOOK phonebook, PEGSMACCESS gsmAccess, PECSIM csim, PEOPTCSIM optCsim) {
		this.header = header;
		this.genericFileManagement = genericFileManagement;
		this.pinCodes = pinCodes;
		this.pukCodes = pukCodes;
		this.akaParameter = akaParameter;
		this.cdmaParameter = cdmaParameter;
		this.securityDomain = securityDomain;
		this.rfm = rfm;
		this.application = application;
		this.nonStandard = nonStandard;
		this.end = end;
		this.rfu1 = rfu1;
		this.rfu2 = rfu2;
		this.rfu3 = rfu3;
		this.rfu4 = rfu4;
		this.rfu5 = rfu5;
		this.mf = mf;
		this.cd = cd;
		this.telecom = telecom;
		this.usim = usim;
		this.optUsim = optUsim;
		this.isim = isim;
		this.optIsim = optIsim;
		this.phonebook = phonebook;
		this.gsmAccess = gsmAccess;
		this.csim = csim;
		this.optCsim = optCsim;
	}

	public int encode(OutputStream os) throws IOException {

		if (code != null) {
			for (int i = code.length - 1; i >= 0; i--) {
				os.write(code[i]);
			}
			return code.length;
		}

		int codeLength = 0;
		if (optCsim != null) {
			codeLength += optCsim.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 26
			os.write(0xBA);
			codeLength += 1;
			return codeLength;
		}
		
		if (csim != null) {
			codeLength += csim.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 25
			os.write(0xB9);
			codeLength += 1;
			return codeLength;
		}
		
		if (gsmAccess != null) {
			codeLength += gsmAccess.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 24
			os.write(0xB8);
			codeLength += 1;
			return codeLength;
		}
		
		if (phonebook != null) {
			codeLength += phonebook.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 23
			os.write(0xB7);
			codeLength += 1;
			return codeLength;
		}
		
		if (optIsim != null) {
			codeLength += optIsim.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 22
			os.write(0xB6);
			codeLength += 1;
			return codeLength;
		}
		
		if (isim != null) {
			codeLength += isim.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 21
			os.write(0xB5);
			codeLength += 1;
			return codeLength;
		}
		
		if (optUsim != null) {
			codeLength += optUsim.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 20
			os.write(0xB4);
			codeLength += 1;
			return codeLength;
		}
		
		if (usim != null) {
			codeLength += usim.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 19
			os.write(0xB3);
			codeLength += 1;
			return codeLength;
		}
		
		if (telecom != null) {
			codeLength += telecom.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 18
			os.write(0xB2);
			codeLength += 1;
			return codeLength;
		}
		
		if (cd != null) {
			codeLength += cd.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 17
			os.write(0xB1);
			codeLength += 1;
			return codeLength;
		}
		
		if (mf != null) {
			codeLength += mf.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 16
			os.write(0xB0);
			codeLength += 1;
			return codeLength;
		}
		
		if (rfu5 != null) {
			codeLength += rfu5.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 15
			os.write(0xAF);
			codeLength += 1;
			return codeLength;
		}
		
		if (rfu4 != null) {
			codeLength += rfu4.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 14
			os.write(0xAE);
			codeLength += 1;
			return codeLength;
		}
		
		if (rfu3 != null) {
			codeLength += rfu3.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 13
			os.write(0xAD);
			codeLength += 1;
			return codeLength;
		}
		
		if (rfu2 != null) {
			codeLength += rfu2.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 12
			os.write(0xAC);
			codeLength += 1;
			return codeLength;
		}
		
		if (rfu1 != null) {
			codeLength += rfu1.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 11
			os.write(0xAB);
			codeLength += 1;
			return codeLength;
		}
		
		if (end != null) {
			codeLength += end.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 10
			os.write(0xAA);
			codeLength += 1;
			return codeLength;
		}
		
		if (nonStandard != null) {
			codeLength += nonStandard.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 9
			os.write(0xA9);
			codeLength += 1;
			return codeLength;
		}
		
		if (application != null) {
			codeLength += application.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 8
			os.write(0xA8);
			codeLength += 1;
			return codeLength;
		}
		
		if (rfm != null) {
			codeLength += rfm.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 7
			os.write(0xA7);
			codeLength += 1;
			return codeLength;
		}
		
		if (securityDomain != null) {
			codeLength += securityDomain.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 6
			os.write(0xA6);
			codeLength += 1;
			return codeLength;
		}
		
		if (cdmaParameter != null) {
			codeLength += cdmaParameter.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 5
			os.write(0xA5);
			codeLength += 1;
			return codeLength;
		}
		
		if (akaParameter != null) {
			codeLength += akaParameter.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 4
			os.write(0xA4);
			codeLength += 1;
			return codeLength;
		}
		
		if (pukCodes != null) {
			codeLength += pukCodes.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 3
			os.write(0xA3);
			codeLength += 1;
			return codeLength;
		}
		
		if (pinCodes != null) {
			codeLength += pinCodes.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 2
			os.write(0xA2);
			codeLength += 1;
			return codeLength;
		}
		
		if (genericFileManagement != null) {
			codeLength += genericFileManagement.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 1
			os.write(0xA1);
			codeLength += 1;
			return codeLength;
		}
		
		if (header != null) {
			codeLength += header.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 0
			os.write(0xA0);
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

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 0)) {
			header = new ProfileHeader();
			codeLength += header.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 1)) {
			genericFileManagement = new PEGenericFileManagement();
			codeLength += genericFileManagement.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 2)) {
			pinCodes = new PEPINCodes();
			codeLength += pinCodes.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 3)) {
			pukCodes = new PEPUKCodes();
			codeLength += pukCodes.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 4)) {
			akaParameter = new PEAKAParameter();
			codeLength += akaParameter.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 5)) {
			cdmaParameter = new PECDMAParameter();
			codeLength += cdmaParameter.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 6)) {
			securityDomain = new PESecurityDomain();
			codeLength += securityDomain.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 7)) {
			rfm = new PERFM();
			codeLength += rfm.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 8)) {
			application = new PEApplication();
			codeLength += application.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 9)) {
			nonStandard = new PENonStandard();
			codeLength += nonStandard.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 10)) {
			end = new PEEnd();
			codeLength += end.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 11)) {
			rfu1 = new PEDummy();
			codeLength += rfu1.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 12)) {
			rfu2 = new PEDummy();
			codeLength += rfu2.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 13)) {
			rfu3 = new PEDummy();
			codeLength += rfu3.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 14)) {
			rfu4 = new PEDummy();
			codeLength += rfu4.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 15)) {
			rfu5 = new PEDummy();
			codeLength += rfu5.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 16)) {
			mf = new PEMF();
			codeLength += mf.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 17)) {
			cd = new PECD();
			codeLength += cd.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 18)) {
			telecom = new PETELECOM();
			codeLength += telecom.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 19)) {
			usim = new PEUSIM();
			codeLength += usim.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 20)) {
			optUsim = new PEOPTUSIM();
			codeLength += optUsim.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 21)) {
			isim = new PEISIM();
			codeLength += isim.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 22)) {
			optIsim = new PEOPTISIM();
			codeLength += optIsim.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 23)) {
			phonebook = new PEPHONEBOOK();
			codeLength += phonebook.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 24)) {
			gsmAccess = new PEGSMACCESS();
			codeLength += gsmAccess.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 25)) {
			csim = new PECSIM();
			codeLength += csim.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 26)) {
			optCsim = new PEOPTCSIM();
			codeLength += optCsim.decode(is, false);
			return codeLength;
		}

		if (passedTag != null) {
			return 0;
		}

		throw new IOException("Error decoding CHOICE: Tag " + berTag + " matched to no item.");
	}

	public void encodeAndSave(int encodingSizeGuess) throws IOException {
		ReverseByteArrayOutputStream os = new ReverseByteArrayOutputStream(encodingSizeGuess);
		encode(os);
		code = os.getArray();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		appendAsString(sb, 0);
		return sb.toString();
	}

	public void appendAsString(StringBuilder sb, int indentLevel) {

		if (header != null) {
			sb.append("header: ");
			header.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (genericFileManagement != null) {
			sb.append("genericFileManagement: ");
			genericFileManagement.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (pinCodes != null) {
			sb.append("pinCodes: ");
			pinCodes.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (pukCodes != null) {
			sb.append("pukCodes: ");
			pukCodes.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (akaParameter != null) {
			sb.append("akaParameter: ");
			akaParameter.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (cdmaParameter != null) {
			sb.append("cdmaParameter: ");
			cdmaParameter.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (securityDomain != null) {
			sb.append("securityDomain: ");
			securityDomain.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (rfm != null) {
			sb.append("rfm: ");
			rfm.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (application != null) {
			sb.append("application: ");
			application.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (nonStandard != null) {
			sb.append("nonStandard: ");
			nonStandard.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (end != null) {
			sb.append("end: ");
			end.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (rfu1 != null) {
			sb.append("rfu1: ");
			rfu1.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (rfu2 != null) {
			sb.append("rfu2: ");
			rfu2.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (rfu3 != null) {
			sb.append("rfu3: ");
			rfu3.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (rfu4 != null) {
			sb.append("rfu4: ");
			rfu4.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (rfu5 != null) {
			sb.append("rfu5: ");
			rfu5.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (mf != null) {
			sb.append("mf: ");
			mf.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (cd != null) {
			sb.append("cd: ");
			cd.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (telecom != null) {
			sb.append("telecom: ");
			telecom.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (usim != null) {
			sb.append("usim: ");
			usim.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (optUsim != null) {
			sb.append("optUsim: ");
			optUsim.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (isim != null) {
			sb.append("isim: ");
			isim.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (optIsim != null) {
			sb.append("optIsim: ");
			optIsim.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (phonebook != null) {
			sb.append("phonebook: ");
			phonebook.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (gsmAccess != null) {
			sb.append("gsmAccess: ");
			gsmAccess.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (csim != null) {
			sb.append("csim: ");
			csim.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (optCsim != null) {
			sb.append("optCsim: ");
			optCsim.appendAsString(sb, indentLevel + 1);
			return;
		}

		sb.append("<none>");
	}

}

