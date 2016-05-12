/* Copyright (c) 2016 Stéphane GRILLON https://github.com/sgrillon14/flags-rest-service
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the <organization> nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.sgrillon.flags.service.impl;

import java.io.File;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.sgrillon.flags.model.Country;
import com.sgrillon.flags.service.CountryService;

/**
 * 
 * @author sgrillon
 *
 */
@Component
public class CountryServiceImpl implements CountryService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryServiceImpl.class);

    @Value("$i18n.config")
    private String i18nPath;

    // TODO: https://es.wikipedia.org/wiki/ISO_3166-1
    /**
     * {@inheritDoc}
     * 
     * @throws MalformedURLException
     */
    @Override
    public List<Country> getAll(String lang) throws MalformedURLException {
        ResourceBundle countries = ResourceBundle.getBundle("i18n" + File.separator + "countries", new Locale(lang));

        LOGGER.debug("getAll:  lang[{}]", lang);
        List<Country> flags = new ArrayList<>();
        flags.add(new Country(4, "AF", "AFG", countries.getString("AF")));
        flags.add(new Country(8, "AL", "ALB", countries.getString("AL")));
        flags.add(new Country(10, "AQ", "ATA", countries.getString("AQ")));
        flags.add(new Country(12, "DZ", "DZA", countries.getString("DZ")));
        flags.add(new Country(16, "AS", "ASM", countries.getString("AS")));
        flags.add(new Country(20, "AD", "AND", countries.getString("AD")));
        flags.add(new Country(24, "AO", "AGO", countries.getString("AO")));
        flags.add(new Country(28, "AG", "ATG", countries.getString("AG")));
        flags.add(new Country(31, "AZ", "AZE", countries.getString("AZ")));
        flags.add(new Country(32, "AR", "ARG", countries.getString("AR")));
        flags.add(new Country(36, "AU", "AUS", countries.getString("AU")));
        flags.add(new Country(40, "AT", "AUT", countries.getString("AT")));
        flags.add(new Country(44, "BS", "BHS", countries.getString("BS")));
        flags.add(new Country(48, "BH", "BHR", countries.getString("BH")));
        flags.add(new Country(50, "BD", "BGD", countries.getString("BD")));
        flags.add(new Country(51, "AM", "ARM", countries.getString("AM")));
        flags.add(new Country(52, "BB", "BRB", countries.getString("BB")));
        flags.add(new Country(56, "BE", "BEL", countries.getString("BE")));
        flags.add(new Country(60, "BM", "BMU", countries.getString("BM")));
        flags.add(new Country(64, "BT", "BTN", countries.getString("BT")));
        flags.add(new Country(68, "BO", "BOL", countries.getString("BO")));
        flags.add(new Country(70, "BA", "BIH", countries.getString("BA")));
        flags.add(new Country(72, "BW", "BWA", countries.getString("BW")));
        flags.add(new Country(74, "BV", "BVT", countries.getString("BV")));
        flags.add(new Country(76, "BR", "BRA", countries.getString("BR")));
        flags.add(new Country(84, "BZ", "BLZ", countries.getString("BZ")));
        flags.add(new Country(86, "IO", "IOT", countries.getString("IO")));
        flags.add(new Country(90, "SB", "SLB", countries.getString("SB")));
        flags.add(new Country(92, "VG", "VGB", countries.getString("VG")));
        flags.add(new Country(96, "BN", "BRN", countries.getString("BN")));
        flags.add(new Country(100, "BG", "BGR", countries.getString("BG")));
        flags.add(new Country(104, "MM", "MMR", countries.getString("MM")));
        flags.add(new Country(108, "BI", "BDI", countries.getString("BI")));
        flags.add(new Country(112, "BY", "BLR", countries.getString("BY")));
        flags.add(new Country(116, "KH", "KHM", countries.getString("KH")));
        flags.add(new Country(120, "CM", "CMR", countries.getString("CM")));
        flags.add(new Country(124, "CA", "CAN", countries.getString("CA")));
        flags.add(new Country(132, "CV", "CPV", countries.getString("CV")));
        flags.add(new Country(136, "KY", "CYM", countries.getString("KY")));
        flags.add(new Country(140, "CF", "CAF", countries.getString("CF")));
        flags.add(new Country(144, "LK", "LKA", countries.getString("LK")));
        flags.add(new Country(148, "TD", "TCD", countries.getString("TD")));
        flags.add(new Country(152, "CL", "CHL", countries.getString("CL")));
        flags.add(new Country(156, "CN", "CHN", countries.getString("CN")));
        flags.add(new Country(158, "TW", "TWN", countries.getString("TW")));
        flags.add(new Country(162, "CX", "CXR", countries.getString("CX")));
        flags.add(new Country(166, "CC", "CCK", countries.getString("CC")));
        flags.add(new Country(170, "CO", "COL", countries.getString("CO")));
        flags.add(new Country(174, "KM", "COM", countries.getString("KM")));
        flags.add(new Country(175, "YT", "MYT", countries.getString("YT")));
        flags.add(new Country(178, "CG", "COG", countries.getString("CG")));
        flags.add(new Country(180, "CD", "COD", countries.getString("CD")));
        flags.add(new Country(184, "CK", "COK", countries.getString("CK")));
        flags.add(new Country(188, "CR", "CRI", countries.getString("CR")));
        flags.add(new Country(191, "HR", "HRV", countries.getString("HR")));
        flags.add(new Country(192, "CU", "CUB", countries.getString("CU")));
        flags.add(new Country(196, "CY", "CYP", countries.getString("CY")));
        flags.add(new Country(203, "CZ", "CZE", countries.getString("CZ")));
        flags.add(new Country(204, "BJ", "BEN", countries.getString("BJ")));
        flags.add(new Country(208, "DK", "DNK", countries.getString("DK")));
        flags.add(new Country(212, "DM", "DMA", countries.getString("DM")));
        flags.add(new Country(214, "DO", "DOM", countries.getString("DO")));
        flags.add(new Country(218, "EC", "ECU", countries.getString("EC")));
        flags.add(new Country(222, "SV", "SLV", countries.getString("SV")));
        flags.add(new Country(226, "GQ", "GNQ", countries.getString("GQ")));
        flags.add(new Country(231, "ET", "ETH", countries.getString("ET")));
        flags.add(new Country(232, "ER", "ERI", countries.getString("ER")));
        flags.add(new Country(233, "EE", "EST", countries.getString("EE")));
        flags.add(new Country(234, "FO", "FRO", countries.getString("FO")));
        flags.add(new Country(238, "FK", "FLK", countries.getString("FK")));
        flags.add(new Country(239, "GS", "SGS", countries.getString("GS")));
        flags.add(new Country(242, "FJ", "FJI", countries.getString("FJ")));
        flags.add(new Country(246, "FI", "FIN", countries.getString("FI")));
        flags.add(new Country(248, "AX", "ALA", countries.getString("AX")));
        flags.add(new Country(250, "FR", "FRA", countries.getString("FR")));
        flags.add(new Country(254, "GF", "GUF", countries.getString("GF")));
        flags.add(new Country(258, "PF", "PYF", countries.getString("PF")));
        flags.add(new Country(260, "TF", "ATF", countries.getString("TF")));
        flags.add(new Country(262, "DJ", "DJI", countries.getString("DJ")));
        flags.add(new Country(266, "GA", "GAB", countries.getString("GA")));
        flags.add(new Country(268, "GE", "GEO", countries.getString("GE")));
        flags.add(new Country(270, "GM", "GMB", countries.getString("GM")));
        flags.add(new Country(275, "PS", "PSE", countries.getString("PS")));
        flags.add(new Country(276, "DE", "DEU", countries.getString("DE")));
        flags.add(new Country(288, "GH", "GHA", countries.getString("GH")));
        flags.add(new Country(292, "GI", "GIB", countries.getString("GI")));
        flags.add(new Country(296, "KI", "KIR", countries.getString("KI")));
        flags.add(new Country(300, "GR", "GRC", countries.getString("GR")));
        flags.add(new Country(304, "GL", "GRL", countries.getString("GL")));
        flags.add(new Country(308, "GD", "GRD", countries.getString("GD")));
        flags.add(new Country(312, "GP", "GLP", countries.getString("GP")));
        flags.add(new Country(316, "GU", "GUM", countries.getString("GU")));
        flags.add(new Country(320, "GT", "GTM", countries.getString("GT")));
        flags.add(new Country(324, "GN", "GIN", countries.getString("GN")));
        flags.add(new Country(328, "GY", "GUY", countries.getString("GY")));
        flags.add(new Country(332, "HT", "HTI", countries.getString("HT")));
        flags.add(new Country(334, "HM", "HMD", countries.getString("HM")));
        flags.add(new Country(336, "VA", "VAT", countries.getString("VA")));
        flags.add(new Country(340, "HN", "HND", countries.getString("HN")));
        flags.add(new Country(344, "HK", "HKG", countries.getString("HK")));
        flags.add(new Country(348, "HU", "HUN", countries.getString("HU")));
        flags.add(new Country(352, "IS", "ISL", countries.getString("IS")));
        flags.add(new Country(356, "IN", "IND", countries.getString("IN")));
        flags.add(new Country(360, "ID", "IDN", countries.getString("ID")));
        flags.add(new Country(364, "IR", "IRN", countries.getString("IR")));
        flags.add(new Country(368, "IQ", "IRQ", countries.getString("IQ")));
        flags.add(new Country(372, "IE", "IRL", countries.getString("IE")));
        flags.add(new Country(376, "IL", "ISR", countries.getString("IL")));
        flags.add(new Country(380, "IT", "ITA", countries.getString("IT")));
        flags.add(new Country(384, "CI", "CIV", countries.getString("CI")));
        flags.add(new Country(388, "JM", "JAM", countries.getString("JM")));
        flags.add(new Country(392, "JP", "JPN", countries.getString("JP")));
        flags.add(new Country(398, "KZ", "KAZ", countries.getString("KZ")));
        flags.add(new Country(400, "JO", "JOR", countries.getString("JO")));
        flags.add(new Country(404, "KE", "KEN", countries.getString("KE")));
        flags.add(new Country(408, "KP", "PRK", countries.getString("KP")));
        flags.add(new Country(410, "KR", "KOR", countries.getString("KR")));
        flags.add(new Country(414, "KW", "KWT", countries.getString("KW")));
        flags.add(new Country(417, "KG", "KGZ", countries.getString("KG")));
        flags.add(new Country(418, "LA", "LAO", countries.getString("LA")));
        flags.add(new Country(422, "LB", "LBN", countries.getString("LB")));
        flags.add(new Country(426, "LS", "LSO", countries.getString("LS")));
        flags.add(new Country(428, "LV", "LVA", countries.getString("LV")));
        flags.add(new Country(430, "LR", "LBR", countries.getString("LR")));
        flags.add(new Country(434, "LY", "LBY", countries.getString("LY")));
        flags.add(new Country(438, "LI", "LIE", countries.getString("LI")));
        flags.add(new Country(440, "LT", "LTU", countries.getString("LT")));
        flags.add(new Country(442, "LU", "LUX", countries.getString("LU")));
        flags.add(new Country(446, "MO", "MAC", countries.getString("MO")));
        flags.add(new Country(450, "MG", "MDG", countries.getString("MG")));
        flags.add(new Country(454, "MW", "MWI", countries.getString("MW")));
        flags.add(new Country(458, "MY", "MYS", countries.getString("MY")));
        flags.add(new Country(462, "MV", "MDV", countries.getString("MV")));
        flags.add(new Country(466, "ML", "MLI", countries.getString("ML")));
        flags.add(new Country(470, "MT", "MLT", countries.getString("MT")));
        flags.add(new Country(474, "MQ", "MTQ", countries.getString("MQ")));
        flags.add(new Country(478, "MR", "MRT", countries.getString("MR")));
        flags.add(new Country(480, "MU", "MUS", countries.getString("MU")));
        flags.add(new Country(484, "MX", "MEX", countries.getString("MX")));
        flags.add(new Country(492, "MC", "MCO", countries.getString("MC")));
        flags.add(new Country(496, "MN", "MNG", countries.getString("MN")));
        flags.add(new Country(498, "MD", "MDA", countries.getString("MD")));
        flags.add(new Country(500, "MS", "MSR", countries.getString("MS")));
        flags.add(new Country(504, "MA", "MAR", countries.getString("MA")));
        flags.add(new Country(508, "MZ", "MOZ", countries.getString("MZ")));
        flags.add(new Country(512, "OM", "OMN", countries.getString("OM")));
        flags.add(new Country(516, "NA", "NAM", countries.getString("NA")));
        flags.add(new Country(520, "NR", "NRU", countries.getString("NR")));
        flags.add(new Country(524, "NP", "NPL", countries.getString("NP")));
        flags.add(new Country(528, "NL", "NLD", countries.getString("NL")));
        flags.add(new Country(530, "AN", "ANT", countries.getString("AN")));
        flags.add(new Country(533, "AW", "ABW", countries.getString("AW")));
        flags.add(new Country(540, "NC", "NCL", countries.getString("NC")));
        flags.add(new Country(548, "VU", "VUT", countries.getString("VU")));
        flags.add(new Country(554, "NZ", "NZL", countries.getString("NZ")));
        flags.add(new Country(558, "NI", "NIC", countries.getString("NI")));
        flags.add(new Country(562, "NE", "NER", countries.getString("NE")));
        flags.add(new Country(566, "NG", "NGA", countries.getString("NG")));
        flags.add(new Country(570, "NU", "NIU", countries.getString("NU")));
        flags.add(new Country(574, "NF", "NFK", countries.getString("NF")));
        flags.add(new Country(578, "NO", "NOR", countries.getString("NO")));
        flags.add(new Country(580, "MP", "MNP", countries.getString("MP")));
        flags.add(new Country(581, "UM", "UMI", countries.getString("UM")));
        flags.add(new Country(583, "FM", "FSM", countries.getString("FM")));
        flags.add(new Country(584, "MH", "MHL", countries.getString("MH")));
        flags.add(new Country(585, "PW", "PLW", countries.getString("PW")));
        flags.add(new Country(586, "PK", "PAK", countries.getString("PK")));
        flags.add(new Country(591, "PA", "PAN", countries.getString("PA")));
        flags.add(new Country(598, "PG", "PNG", countries.getString("PG")));
        flags.add(new Country(600, "PY", "PRY", countries.getString("PY")));
        flags.add(new Country(604, "PE", "PER", countries.getString("PE")));
        flags.add(new Country(608, "PH", "PHL", countries.getString("PH")));
        flags.add(new Country(612, "PN", "PCN", countries.getString("PN")));
        flags.add(new Country(616, "PL", "POL", countries.getString("PL")));
        flags.add(new Country(620, "PT", "PRT", countries.getString("PT")));
        flags.add(new Country(624, "GW", "GNB", countries.getString("GW")));
        flags.add(new Country(626, "TL", "TLS", countries.getString("TL")));
        flags.add(new Country(630, "PR", "PRI", countries.getString("PR")));
        flags.add(new Country(634, "QA", "QAT", countries.getString("QA")));
        flags.add(new Country(638, "RE", "REU", countries.getString("RE")));
        flags.add(new Country(642, "RO", "ROU", countries.getString("RO")));
        flags.add(new Country(643, "RU", "RUS", countries.getString("RU")));
        flags.add(new Country(646, "RW", "RWA", countries.getString("RW")));
        flags.add(new Country(654, "SH", "SHN", countries.getString("SH")));
        flags.add(new Country(659, "KN", "KNA", countries.getString("KN")));
        flags.add(new Country(660, "AI", "AIA", countries.getString("AI")));
        flags.add(new Country(662, "LC", "LCA", countries.getString("LC")));
        flags.add(new Country(666, "PM", "SPM", countries.getString("PM")));
        flags.add(new Country(670, "VC", "VCT", countries.getString("VC")));
        flags.add(new Country(674, "SM", "SMR", countries.getString("SM")));
        flags.add(new Country(678, "ST", "STP", countries.getString("ST")));
        flags.add(new Country(682, "SA", "SAU", countries.getString("SA")));
        flags.add(new Country(686, "SN", "SEN", countries.getString("SN")));
        flags.add(new Country(690, "SC", "SYC", countries.getString("SC")));
        flags.add(new Country(694, "SL", "SLE", countries.getString("SL")));
        flags.add(new Country(702, "SG", "SGP", countries.getString("SG")));
        flags.add(new Country(703, "SK", "SVK", countries.getString("SK")));
        flags.add(new Country(704, "VN", "VNM", countries.getString("VN")));
        flags.add(new Country(705, "SI", "SVN", countries.getString("SI")));
        flags.add(new Country(706, "SO", "SOM", countries.getString("SO")));
        flags.add(new Country(710, "ZA", "ZAF", countries.getString("ZA")));
        flags.add(new Country(716, "ZW", "ZWE", countries.getString("ZW")));
        flags.add(new Country(724, "ES", "ESP", countries.getString("ES")));
        flags.add(new Country(732, "EH", "ESH", countries.getString("EH")));
        flags.add(new Country(736, "SD", "SDN", countries.getString("SD")));
        flags.add(new Country(740, "SR", "SUR", countries.getString("SR")));
        flags.add(new Country(744, "SJ", "SJM", countries.getString("SJ")));
        flags.add(new Country(748, "SZ", "SWZ", countries.getString("SZ")));
        flags.add(new Country(752, "SE", "SWE", countries.getString("SE")));
        flags.add(new Country(756, "CH", "CHE", countries.getString("CH")));
        flags.add(new Country(760, "SY", "SYR", countries.getString("SY")));
        flags.add(new Country(762, "TJ", "TJK", countries.getString("TJ")));
        flags.add(new Country(764, "TH", "THA", countries.getString("TH")));
        flags.add(new Country(768, "TG", "TGO", countries.getString("TG")));
        flags.add(new Country(772, "TK", "TKL", countries.getString("TK")));
        flags.add(new Country(776, "TO", "TON", countries.getString("TO")));
        flags.add(new Country(780, "TT", "TTO", countries.getString("TT")));
        flags.add(new Country(784, "AE", "ARE", countries.getString("AE")));
        flags.add(new Country(788, "TN", "TUN", countries.getString("TN")));
        flags.add(new Country(792, "TR", "TUR", countries.getString("TR")));
        flags.add(new Country(795, "TM", "TKM", countries.getString("TM")));
        flags.add(new Country(796, "TC", "TCA", countries.getString("TC")));
        flags.add(new Country(798, "TV", "TUV", countries.getString("TV")));
        flags.add(new Country(800, "UG", "UGA", countries.getString("UG")));
        flags.add(new Country(804, "UA", "UKR", countries.getString("UA")));
        flags.add(new Country(807, "MK", "MKD", countries.getString("MK")));
        flags.add(new Country(818, "EG", "EGY", countries.getString("EG")));
        flags.add(new Country(826, "GB", "GBR", countries.getString("GB")));
        flags.add(new Country(833, "IM", "IMN", countries.getString("IM")));
        flags.add(new Country(834, "TZ", "TZA", countries.getString("TZ")));
        flags.add(new Country(840, "US", "USA", countries.getString("US")));
        flags.add(new Country(850, "VI", "VIR", countries.getString("VI")));
        flags.add(new Country(854, "BF", "BFA", countries.getString("BF")));
        flags.add(new Country(858, "UY", "URY", countries.getString("UY")));
        flags.add(new Country(860, "UZ", "UZB", countries.getString("UZ")));
        flags.add(new Country(862, "VE", "VEN", countries.getString("VE")));
        flags.add(new Country(876, "WF", "WLF", countries.getString("WF")));
        flags.add(new Country(882, "WS", "WSM", countries.getString("WS")));
        flags.add(new Country(887, "YE", "YEM", countries.getString("YE")));
        flags.add(new Country(891, "CS", "SCG", countries.getString("CS")));
        flags.add(new Country(894, "ZM", "ZMB", countries.getString("ZM")));

        return flags;
    }

}
