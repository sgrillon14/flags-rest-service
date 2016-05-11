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

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Country> getAll(String lang) {
        LOGGER.debug("getAll:  lang[{}]", lang);
        List<Country> flags = new ArrayList<>();
        flags.add(new Country(4, "AF", "AFG", ("fr".equals(lang)) ? "Afghanistan" : "Afghanistan"));
        flags.add(new Country(8, "AL", "ALB", ("fr".equals(lang)) ? "Albanie" : "Albania"));
        flags.add(new Country(10, "AQ", "ATA", ("fr".equals(lang)) ? "Antarctique" : "Antarctica"));
        flags.add(new Country(12, "DZ", "DZA", ("fr".equals(lang)) ? "Algérie" : "Algeria"));
        flags.add(new Country(16, "AS", "ASM", ("fr".equals(lang)) ? "Samoa Américaines" : "American Samoa"));
        flags.add(new Country(20, "AD", "AND", ("fr".equals(lang)) ? "Andorre" : "Andorra"));
        flags.add(new Country(24, "AO", "AGO", ("fr".equals(lang)) ? "Angola" : "Angola"));
        flags.add(new Country(28, "AG", "ATG", ("fr".equals(lang)) ? "Antigua-et-Barbuda" : "Antigua and Barbuda"));
        flags.add(new Country(31, "AZ", "AZE", ("fr".equals(lang)) ? "Azerbaïdjan" : "Azerbaijan"));
        flags.add(new Country(32, "AR", "ARG", ("fr".equals(lang)) ? "Argentine" : "Argentina"));
        flags.add(new Country(36, "AU", "AUS", ("fr".equals(lang)) ? "Australie" : "Australia"));
        flags.add(new Country(40, "AT", "AUT", ("fr".equals(lang)) ? "Autriche" : "Austria"));
        flags.add(new Country(44, "BS", "BHS", ("fr".equals(lang)) ? "Bahamas" : "Bahamas"));
        flags.add(new Country(48, "BH", "BHR", ("fr".equals(lang)) ? "Bahreïn" : "Bahrain"));
        flags.add(new Country(50, "BD", "BGD", ("fr".equals(lang)) ? "Bangladesh" : "Bangladesh"));
        flags.add(new Country(51, "AM", "ARM", ("fr".equals(lang)) ? "Arménie" : "Armenia"));
        flags.add(new Country(52, "BB", "BRB", ("fr".equals(lang)) ? "Barbade" : "Barbados"));
        flags.add(new Country(56, "BE", "BEL", ("fr".equals(lang)) ? "Belgique" : "Belgium"));
        flags.add(new Country(60, "BM", "BMU", ("fr".equals(lang)) ? "Bermudes" : "Bermuda"));
        flags.add(new Country(64, "BT", "BTN", ("fr".equals(lang)) ? "Bhoutan" : "Bhutan"));
        flags.add(new Country(68, "BO", "BOL", ("fr".equals(lang)) ? "Bolivie" : "Bolivia"));
        flags.add(new Country(70, "BA", "BIH", ("fr".equals(lang)) ? "Bosnie-Herzégovine" : "Bosnia and Herzegovina"));
        flags.add(new Country(72, "BW", "BWA", ("fr".equals(lang)) ? "Botswana" : "Botswana"));
        flags.add(new Country(74, "BV", "BVT", ("fr".equals(lang)) ? "Île Bouvet" : "Bouvet Island"));
        flags.add(new Country(76, "BR", "BRA", ("fr".equals(lang)) ? "Brésil" : "Brazil"));
        flags.add(new Country(84, "BZ", "BLZ", ("fr".equals(lang)) ? "Belize" : "Belize"));
        flags.add(new Country(86, "IO", "IOT", ("fr".equals(lang)) ? "Territoire Britannique de l'Océan Indien" : "British Indian Ocean Territory"));
        flags.add(new Country(90, "SB", "SLB", ("fr".equals(lang)) ? "Îles Salomon" : "Solomon Islands"));
        flags.add(new Country(92, "VG", "VGB", ("fr".equals(lang)) ? "Îles Vierges Britanniques" : "British Virgin Islands"));
        flags.add(new Country(96, "BN", "BRN", ("fr".equals(lang)) ? "Brunéi Darussalam" : "Brunei Darussalam"));
        flags.add(new Country(100, "BG", "BGR", ("fr".equals(lang)) ? "Bulgarie" : "Bulgaria"));
        flags.add(new Country(104, "MM", "MMR", ("fr".equals(lang)) ? "Myanmar" : "Myanmar"));
        flags.add(new Country(108, "BI", "BDI", ("fr".equals(lang)) ? "Burundi" : "Burundi"));
        flags.add(new Country(112, "BY", "BLR", ("fr".equals(lang)) ? "Bélarus" : "Belarus"));
        flags.add(new Country(116, "KH", "KHM", ("fr".equals(lang)) ? "Cambodge" : "Cambodia"));
        flags.add(new Country(120, "CM", "CMR", ("fr".equals(lang)) ? "Cameroun" : "Cameroon"));
        flags.add(new Country(124, "CA", "CAN", ("fr".equals(lang)) ? "Canada" : "Canada"));
        flags.add(new Country(132, "CV", "CPV", ("fr".equals(lang)) ? "Cap-vert" : "Cape Verde"));
        flags.add(new Country(136, "KY", "CYM", ("fr".equals(lang)) ? "Îles Caïmanes" : "Cayman Islands"));
        flags.add(new Country(140, "CF", "CAF", ("fr".equals(lang)) ? "République Centrafricaine" : "Central African"));
        flags.add(new Country(144, "LK", "LKA", ("fr".equals(lang)) ? "Sri Lanka" : "Sri Lanka"));
        flags.add(new Country(148, "TD", "TCD", ("fr".equals(lang)) ? "Tchad" : "Chad"));
        flags.add(new Country(152, "CL", "CHL", ("fr".equals(lang)) ? "Chili" : "Chile"));
        flags.add(new Country(156, "CN", "CHN", ("fr".equals(lang)) ? "Chine" : "China"));
        flags.add(new Country(158, "TW", "TWN", ("fr".equals(lang)) ? "Taïwan" : "Taiwan"));
        flags.add(new Country(162, "CX", "CXR", ("fr".equals(lang)) ? "Île Christmas" : "Christmas Island"));
        flags.add(new Country(166, "CC", "CCK", ("fr".equals(lang)) ? "Îles Cocos (Keeling)" : "Cocos (Keeling) Islands"));
        flags.add(new Country(170, "CO", "COL", ("fr".equals(lang)) ? "Colombie" : "Colombia"));
        flags.add(new Country(174, "KM", "COM", ("fr".equals(lang)) ? "Comores" : "Comoros"));
        flags.add(new Country(175, "YT", "MYT", ("fr".equals(lang)) ? "Mayotte" : "Mayotte"));
        flags.add(new Country(178, "CG", "COG", ("fr".equals(lang)) ? "République du Congo" : "Republic of the Congo"));
        flags.add(new Country(180, "CD", "COD", ("fr".equals(lang)) ? "République Démocratique du Congo" : "The Democratic Republic Of The Congo"));
        flags.add(new Country(184, "CK", "COK", ("fr".equals(lang)) ? "Îles Cook" : "Cook Islands"));
        flags.add(new Country(188, "CR", "CRI", ("fr".equals(lang)) ? "Costa Rica" : "Costa Rica"));
        flags.add(new Country(191, "HR", "HRV", ("fr".equals(lang)) ? "Croatie" : "Croatia"));
        flags.add(new Country(192, "CU", "CUB", ("fr".equals(lang)) ? "Cuba" : "Cuba"));
        flags.add(new Country(196, "CY", "CYP", ("fr".equals(lang)) ? "Chypre" : "Cyprus"));
        flags.add(new Country(203, "CZ", "CZE", ("fr".equals(lang)) ? "République Tchèque" : "Czech Republic"));
        flags.add(new Country(204, "BJ", "BEN", ("fr".equals(lang)) ? "Bénin" : "Benin"));
        flags.add(new Country(208, "DK", "DNK", ("fr".equals(lang)) ? "Danemark" : "Denmark"));
        flags.add(new Country(212, "DM", "DMA", ("fr".equals(lang)) ? "Dominique" : "Dominica"));
        flags.add(new Country(214, "DO", "DOM", ("fr".equals(lang)) ? "République Dominicaine" : "Dominican Republic"));
        flags.add(new Country(218, "EC", "ECU", ("fr".equals(lang)) ? "Équateur" : "Ecuador"));
        flags.add(new Country(222, "SV", "SLV", ("fr".equals(lang)) ? "El Salvador" : "El Salvador"));
        flags.add(new Country(226, "GQ", "GNQ", ("fr".equals(lang)) ? "Guinée Équatoriale" : "Equatorial Guinea"));
        flags.add(new Country(231, "ET", "ETH", ("fr".equals(lang)) ? "Éthiopie" : "Ethiopia"));
        flags.add(new Country(232, "ER", "ERI", ("fr".equals(lang)) ? "Érythrée" : "Eritrea"));
        flags.add(new Country(233, "EE", "EST", ("fr".equals(lang)) ? "Estonie" : "Estonia"));
        flags.add(new Country(234, "FO", "FRO", ("fr".equals(lang)) ? "Îles Féroé" : "Faroe Islands"));
        flags.add(new Country(238, "FK", "FLK", ("fr".equals(lang)) ? "Îles (malvinas) Falkland" : "Falkland Islands"));
        flags.add(new Country(239, "GS", "SGS", ("fr".equals(lang)) ? "Géorgie du Sud et les Îles Sandwich du Sud" : "South Georgia and the South Sandwich Islands"));
        flags.add(new Country(242, "FJ", "FJI", ("fr".equals(lang)) ? "Fidji" : "Fiji"));
        flags.add(new Country(246, "FI", "FIN", ("fr".equals(lang)) ? "Finlande" : "Finland"));
        flags.add(new Country(248, "AX", "ALA", ("fr".equals(lang)) ? "Îles Åland" : "Åland Islands"));
        flags.add(new Country(250, "FR", "FRA", ("fr".equals(lang)) ? "France" : "France"));
        flags.add(new Country(254, "GF", "GUF", ("fr".equals(lang)) ? "Guyane Française" : "French Guiana"));
        flags.add(new Country(258, "PF", "PYF", ("fr".equals(lang)) ? "Polynésie Française" : "French Polynesia"));
        flags.add(new Country(260, "TF", "ATF", ("fr".equals(lang)) ? "Terres Australes Françaises" : "French Southern Territories"));
        flags.add(new Country(262, "DJ", "DJI", ("fr".equals(lang)) ? "Djibouti" : "Djibouti"));
        flags.add(new Country(266, "GA", "GAB", ("fr".equals(lang)) ? "Gabon" : "Gabon"));
        flags.add(new Country(268, "GE", "GEO", ("fr".equals(lang)) ? "Géorgie" : "Georgia"));
        flags.add(new Country(270, "GM", "GMB", ("fr".equals(lang)) ? "Gambie" : "Gambia"));
        flags.add(new Country(275, "PS", "PSE", ("fr".equals(lang)) ? "Territoire Palestinien Occupé" : "Occupied Palestinian Territory"));
        flags.add(new Country(276, "DE", "DEU", ("fr".equals(lang)) ? "Allemagne" : "Germany"));
        flags.add(new Country(288, "GH", "GHA", ("fr".equals(lang)) ? "Ghana" : "Ghana"));
        flags.add(new Country(292, "GI", "GIB", ("fr".equals(lang)) ? "Gibraltar" : "Gibraltar"));
        flags.add(new Country(296, "KI", "KIR", ("fr".equals(lang)) ? "Kiribati" : "Kiribati"));
        flags.add(new Country(300, "GR", "GRC", ("fr".equals(lang)) ? "Grèce" : "Greece"));
        flags.add(new Country(304, "GL", "GRL", ("fr".equals(lang)) ? "Groenland" : "Greenland"));
        flags.add(new Country(308, "GD", "GRD", ("fr".equals(lang)) ? "Grenade" : "Grenada"));
        flags.add(new Country(312, "GP", "GLP", ("fr".equals(lang)) ? "Guadeloupe" : "Guadeloupe"));
        flags.add(new Country(316, "GU", "GUM", ("fr".equals(lang)) ? "Guam" : "Guam"));
        flags.add(new Country(320, "GT", "GTM", ("fr".equals(lang)) ? "Guatemala" : "Guatemala"));
        flags.add(new Country(324, "GN", "GIN", ("fr".equals(lang)) ? "Guinée" : "Guinea"));
        flags.add(new Country(328, "GY", "GUY", ("fr".equals(lang)) ? "Guyana" : "Guyana"));
        flags.add(new Country(332, "HT", "HTI", ("fr".equals(lang)) ? "Haïti" : "Haiti"));
        flags.add(new Country(334, "HM", "HMD", ("fr".equals(lang)) ? "Îles Heard et Mcdonald" : "Heard Island and McDonald Islands"));
        flags.add(new Country(336, "VA", "VAT", ("fr".equals(lang)) ? "Saint-Siège (état de la Cité du Vatican)" : "Vatican City State"));
        flags.add(new Country(340, "HN", "HND", ("fr".equals(lang)) ? "Honduras" : "Honduras"));
        flags.add(new Country(344, "HK", "HKG", ("fr".equals(lang)) ? "Hong-Kong" : "Hong Kong"));
        flags.add(new Country(348, "HU", "HUN", ("fr".equals(lang)) ? "Hongrie" : "Hungary"));
        flags.add(new Country(352, "IS", "ISL", ("fr".equals(lang)) ? "Islande" : "Iceland"));
        flags.add(new Country(356, "IN", "IND", ("fr".equals(lang)) ? "Inde" : "India"));
        flags.add(new Country(360, "ID", "IDN", ("fr".equals(lang)) ? "Indonésie" : "Indonesia"));
        flags.add(new Country(364, "IR", "IRN", ("fr".equals(lang)) ? "République Islamique d'Iran" : "Islamic Republic of Iran"));
        flags.add(new Country(368, "IQ", "IRQ", ("fr".equals(lang)) ? "Iraq" : "Iraq"));
        flags.add(new Country(372, "IE", "IRL", ("fr".equals(lang)) ? "Irlande" : "Ireland"));
        flags.add(new Country(376, "IL", "ISR", ("fr".equals(lang)) ? "Israël" : "Israel"));
        flags.add(new Country(380, "IT", "ITA", ("fr".equals(lang)) ? "Italie" : "Italy"));
        flags.add(new Country(384, "CI", "CIV", ("fr".equals(lang)) ? "Côte d'Ivoire" : "Côte d'Ivoire"));
        flags.add(new Country(388, "JM", "JAM", ("fr".equals(lang)) ? "Jamaïque" : "Jamaica"));
        flags.add(new Country(392, "JP", "JPN", ("fr".equals(lang)) ? "Japon" : "Japan"));
        flags.add(new Country(398, "KZ", "KAZ", ("fr".equals(lang)) ? "Kazakhstan" : "Kazakhstan"));
        flags.add(new Country(400, "JO", "JOR", ("fr".equals(lang)) ? "Jordanie" : "Jordan"));
        flags.add(new Country(404, "KE", "KEN", ("fr".equals(lang)) ? "Kenya" : "Kenya"));
        flags.add(new Country(408, "KP", "PRK", ("fr".equals(lang)) ? "République Populaire Démocratique de Corée" : "Democratic People's Republic of Korea"));
        flags.add(new Country(410, "KR", "KOR", ("fr".equals(lang)) ? "République de Corée" : "Republic of Korea"));
        flags.add(new Country(414, "KW", "KWT", ("fr".equals(lang)) ? "Koweït" : "Kuwait"));
        flags.add(new Country(417, "KG", "KGZ", ("fr".equals(lang)) ? "Kirghizistan" : "Kyrgyzstan"));
        flags.add(new Country(418, "LA", "LAO", ("fr".equals(lang)) ? "République Démocratique Populaire Lao" : "Lao People's Democratic Republic"));
        flags.add(new Country(422, "LB", "LBN", ("fr".equals(lang)) ? "Liban" : "Lebanon"));
        flags.add(new Country(426, "LS", "LSO", ("fr".equals(lang)) ? "Lesotho" : "Lesotho"));
        flags.add(new Country(428, "LV", "LVA", ("fr".equals(lang)) ? "Lettonie" : "Latvia"));
        flags.add(new Country(430, "LR", "LBR", ("fr".equals(lang)) ? "Libéria" : "Liberia"));
        flags.add(new Country(434, "LY", "LBY", ("fr".equals(lang)) ? "Jamahiriya Arabe Libyenne" : "Libyan Arab Jamahiriya"));
        flags.add(new Country(438, "LI", "LIE", ("fr".equals(lang)) ? "Liechtenstein" : "Liechtenstein"));
        flags.add(new Country(440, "LT", "LTU", ("fr".equals(lang)) ? "Lituanie" : "Lithuania"));
        flags.add(new Country(442, "LU", "LUX", ("fr".equals(lang)) ? "Luxembourg" : "Luxembourg"));
        flags.add(new Country(446, "MO", "MAC", ("fr".equals(lang)) ? "Macao" : "Macao"));
        flags.add(new Country(450, "MG", "MDG", ("fr".equals(lang)) ? "Madagascar" : "Madagascar"));
        flags.add(new Country(454, "MW", "MWI", ("fr".equals(lang)) ? "Malawi" : "Malawi"));
        flags.add(new Country(458, "MY", "MYS", ("fr".equals(lang)) ? "Malaisie" : "Malaysia"));
        flags.add(new Country(462, "MV", "MDV", ("fr".equals(lang)) ? "Maldives" : "Maldives"));
        flags.add(new Country(466, "ML", "MLI", ("fr".equals(lang)) ? "Mali" : "Mali"));
        flags.add(new Country(470, "MT", "MLT", ("fr".equals(lang)) ? "Malte" : "Malta"));
        flags.add(new Country(474, "MQ", "MTQ", ("fr".equals(lang)) ? "Martinique" : "Martinique"));
        flags.add(new Country(478, "MR", "MRT", ("fr".equals(lang)) ? "Mauritanie" : "Mauritania"));
        flags.add(new Country(480, "MU", "MUS", ("fr".equals(lang)) ? "Maurice" : "Mauritius"));
        flags.add(new Country(484, "MX", "MEX", ("fr".equals(lang)) ? "Mexique" : "Mexico"));
        flags.add(new Country(492, "MC", "MCO", ("fr".equals(lang)) ? "Monaco" : "Monaco"));
        flags.add(new Country(496, "MN", "MNG", ("fr".equals(lang)) ? "Mongolie" : "Mongolia"));
        flags.add(new Country(498, "MD", "MDA", ("fr".equals(lang)) ? "République de Moldova" : "Republic of Moldova"));
        flags.add(new Country(500, "MS", "MSR", ("fr".equals(lang)) ? "Montserrat" : "Montserrat"));
        flags.add(new Country(504, "MA", "MAR", ("fr".equals(lang)) ? "Maroc" : "Morocco"));
        flags.add(new Country(508, "MZ", "MOZ", ("fr".equals(lang)) ? "Mozambique" : "Mozambique"));
        flags.add(new Country(512, "OM", "OMN", ("fr".equals(lang)) ? "Oman" : "Oman"));
        flags.add(new Country(516, "NA", "NAM", ("fr".equals(lang)) ? "Namibie" : "Namibia"));
        flags.add(new Country(520, "NR", "NRU", ("fr".equals(lang)) ? "Nauru" : "Nauru"));
        flags.add(new Country(524, "NP", "NPL", ("fr".equals(lang)) ? "Népal" : "Nepal"));
        flags.add(new Country(528, "NL", "NLD", ("fr".equals(lang)) ? "Pays-Bas" : "Netherlands"));
        flags.add(new Country(533, "AW", "ABW", ("fr".equals(lang)) ? "Aruba" : "Aruba"));
        flags.add(new Country(540, "NC", "NCL", ("fr".equals(lang)) ? "Nouvelle-Calédonie" : "New Caledonia"));
        flags.add(new Country(548, "VU", "VUT", ("fr".equals(lang)) ? "Vanuatu" : "Vanuatu"));
        flags.add(new Country(554, "NZ", "NZL", ("fr".equals(lang)) ? "Nouvelle-Zélande" : "New Zealand"));
        flags.add(new Country(558, "NI", "NIC", ("fr".equals(lang)) ? "Nicaragua" : "Nicaragua"));
        flags.add(new Country(562, "NE", "NER", ("fr".equals(lang)) ? "Niger" : "Niger"));
        flags.add(new Country(566, "NG", "NGA", ("fr".equals(lang)) ? "Nigéria" : "Nigeria"));
        flags.add(new Country(570, "NU", "NIU", ("fr".equals(lang)) ? "Niué" : "Niue"));
        flags.add(new Country(574, "NF", "NFK", ("fr".equals(lang)) ? "Île Norfolk" : "Norfolk Island"));
        flags.add(new Country(578, "NO", "NOR", ("fr".equals(lang)) ? "Norvège" : "Norway"));
        flags.add(new Country(580, "MP", "MNP", ("fr".equals(lang)) ? "Îles Mariannes du Nord" : "Northern Mariana Islands"));
        flags.add(new Country(581, "UM", "UMI", ("fr".equals(lang)) ? "Îles Mineures Éloignées des États-Unis" : "United States Minor Outlying Islands"));
        flags.add(new Country(583, "FM", "FSM", ("fr".equals(lang)) ? "États Fédérés de Micronésie" : "Federated States of Micronesia"));
        flags.add(new Country(584, "MH", "MHL", ("fr".equals(lang)) ? "Îles Marshall" : "Marshall Islands"));
        flags.add(new Country(585, "PW", "PLW", ("fr".equals(lang)) ? "Palaos" : "Palau"));
        flags.add(new Country(586, "PK", "PAK", ("fr".equals(lang)) ? "Pakistan" : "Pakistan"));
        flags.add(new Country(591, "PA", "PAN", ("fr".equals(lang)) ? "Panama" : "Panama"));
        flags.add(new Country(598, "PG", "PNG", ("fr".equals(lang)) ? "Papouasie-Nouvelle-Guinée" : "Papua New Guinea"));
        flags.add(new Country(600, "PY", "PRY", ("fr".equals(lang)) ? "Paraguay" : "Paraguay"));
        flags.add(new Country(604, "PE", "PER", ("fr".equals(lang)) ? "Pérou" : "Peru"));
        flags.add(new Country(608, "PH", "PHL", ("fr".equals(lang)) ? "Philippines" : "Philippines"));
        flags.add(new Country(612, "PN", "PCN", ("fr".equals(lang)) ? "Pitcairn" : "Pitcairn"));
        flags.add(new Country(616, "PL", "POL", ("fr".equals(lang)) ? "Pologne" : "Poland"));
        flags.add(new Country(620, "PT", "PRT", ("fr".equals(lang)) ? "Portugal" : "Portugal"));
        flags.add(new Country(624, "GW", "GNB", ("fr".equals(lang)) ? "Guinée-Bissau" : "Guinea-Bissau"));
        flags.add(new Country(626, "TL", "TLS", ("fr".equals(lang)) ? "Timor-Leste" : "Timor-Leste"));
        flags.add(new Country(630, "PR", "PRI", ("fr".equals(lang)) ? "Porto Rico" : "Puerto Rico"));
        flags.add(new Country(634, "QA", "QAT", ("fr".equals(lang)) ? "Qatar" : "Qatar"));
        flags.add(new Country(638, "RE", "REU", ("fr".equals(lang)) ? "Réunion" : "Réunion"));
        flags.add(new Country(642, "RO", "ROU", ("fr".equals(lang)) ? "Roumanie" : "Romania"));
        flags.add(new Country(643, "RU", "RUS", ("fr".equals(lang)) ? "Fédération de Russie" : "Russian Federation"));
        flags.add(new Country(646, "RW", "RWA", ("fr".equals(lang)) ? "Rwanda" : "Rwanda"));
        flags.add(new Country(654, "SH", "SHN", ("fr".equals(lang)) ? "Sainte-Hélène" : "Saint Helena"));
        flags.add(new Country(659, "KN", "KNA", ("fr".equals(lang)) ? "Saint-Kitts-et-Nevis" : "Saint Kitts and Nevis"));
        flags.add(new Country(660, "AI", "AIA", ("fr".equals(lang)) ? "Anguilla" : "Anguilla"));
        flags.add(new Country(662, "LC", "LCA", ("fr".equals(lang)) ? "Sainte-Lucie" : "Saint Lucia"));
        flags.add(new Country(666, "PM", "SPM", ("fr".equals(lang)) ? "Saint-Pierre-et-Miquelon" : "Saint-Pierre and Miquelon"));
        flags.add(new Country(670, "VC", "VCT", ("fr".equals(lang)) ? "Saint-Vincent-et-les Grenadines" : "Saint Vincent and the Grenadines"));
        flags.add(new Country(674, "SM", "SMR", ("fr".equals(lang)) ? "Saint-Marin" : "San Marino"));
        flags.add(new Country(678, "ST", "STP", ("fr".equals(lang)) ? "Sao Tomé-et-Principe" : "Sao Tome and Principe"));
        flags.add(new Country(682, "SA", "SAU", ("fr".equals(lang)) ? "Arabie Saoudite" : "Saudi Arabia"));
        flags.add(new Country(686, "SN", "SEN", ("fr".equals(lang)) ? "Sénégal" : "Senegal"));
        flags.add(new Country(690, "SC", "SYC", ("fr".equals(lang)) ? "Seychelles" : "Seychelles"));
        flags.add(new Country(694, "SL", "SLE", ("fr".equals(lang)) ? "Sierra Leone" : "Sierra Leone"));
        flags.add(new Country(702, "SG", "SGP", ("fr".equals(lang)) ? "Singapour" : "Singapore"));
        flags.add(new Country(703, "SK", "SVK", ("fr".equals(lang)) ? "Slovaquie" : "Slovakia"));
        flags.add(new Country(704, "VN", "VNM", ("fr".equals(lang)) ? "Viet Nam" : "Vietnam"));
        flags.add(new Country(705, "SI", "SVN", ("fr".equals(lang)) ? "Slovénie" : "Slovenia"));
        flags.add(new Country(706, "SO", "SOM", ("fr".equals(lang)) ? "Somalie" : "Somalia"));
        flags.add(new Country(710, "ZA", "ZAF", ("fr".equals(lang)) ? "Afrique du Sud" : "South Africa"));
        flags.add(new Country(716, "ZW", "ZWE", ("fr".equals(lang)) ? "Zimbabwe" : "Zimbabwe"));
        flags.add(new Country(724, "ES", "ESP", ("fr".equals(lang)) ? "Espagne" : "Spain"));
        flags.add(new Country(732, "EH", "ESH", ("fr".equals(lang)) ? "Sahara Occidental" : "Western Sahara"));
        flags.add(new Country(736, "SD", "SDN", ("fr".equals(lang)) ? "Soudan" : "Sudan"));
        flags.add(new Country(740, "SR", "SUR", ("fr".equals(lang)) ? "Suriname" : "Suriname"));
        flags.add(new Country(744, "SJ", "SJM", ("fr".equals(lang)) ? "Svalbard etÎle Jan Mayen" : "Svalbard and Jan Mayen"));
        flags.add(new Country(748, "SZ", "SWZ", ("fr".equals(lang)) ? "Swaziland" : "Swaziland"));
        flags.add(new Country(752, "SE", "SWE", ("fr".equals(lang)) ? "Suède" : "Sweden"));
        flags.add(new Country(756, "CH", "CHE", ("fr".equals(lang)) ? "Suisse" : "Switzerland"));
        flags.add(new Country(760, "SY", "SYR", ("fr".equals(lang)) ? "République Arabe Syrienne" : "Syrian Arab Republic"));
        flags.add(new Country(762, "TJ", "TJK", ("fr".equals(lang)) ? "Tadjikistan" : "Tajikistan"));
        flags.add(new Country(764, "TH", "THA", ("fr".equals(lang)) ? "Thaïlande" : "Thailand"));
        flags.add(new Country(768, "TG", "TGO", ("fr".equals(lang)) ? "Togo" : "Togo"));
        flags.add(new Country(772, "TK", "TKL", ("fr".equals(lang)) ? "Tokelau" : "Tokelau"));
        flags.add(new Country(776, "TO", "TON", ("fr".equals(lang)) ? "Tonga" : "Tonga"));
        flags.add(new Country(780, "TT", "TTO", ("fr".equals(lang)) ? "Trinité-et-Tobago" : "Trinidad and Tobago"));
        flags.add(new Country(784, "AE", "ARE", ("fr".equals(lang)) ? "Émirats Arabes Unis" : "United Arab Emirates"));
        flags.add(new Country(788, "TN", "TUN", ("fr".equals(lang)) ? "Tunisie" : "Tunisia"));
        flags.add(new Country(792, "TR", "TUR", ("fr".equals(lang)) ? "Turquie" : "Turkey"));
        flags.add(new Country(795, "TM", "TKM", ("fr".equals(lang)) ? "Turkménistan" : "Turkmenistan"));
        flags.add(new Country(796, "TC", "TCA", ("fr".equals(lang)) ? "Îles Turks et Caïques" : "Turks and Caicos Islands"));
        flags.add(new Country(798, "TV", "TUV", ("fr".equals(lang)) ? "Tuvalu" : "Tuvalu"));
        flags.add(new Country(800, "UG", "UGA", ("fr".equals(lang)) ? "Ouganda" : "Uganda"));
        flags.add(new Country(804, "UA", "UKR", ("fr".equals(lang)) ? "Ukraine" : "Ukraine"));
        flags.add(new Country(807, "MK", "MKD", ("fr".equals(lang)) ? "L'ex-République Yougoslave de Macédoine" : "The Former Yugoslav Republic of Macedonia"));
        flags.add(new Country(818, "EG", "EGY", ("fr".equals(lang)) ? "Égypte" : "Egypt"));
        flags.add(new Country(826, "GB", "GBR", ("fr".equals(lang)) ? "Royaume-Uni" : "United Kingdom"));
        flags.add(new Country(833, "IM", "IMN", ("fr".equals(lang)) ? "Île de Man" : "Isle of Man"));
        flags.add(new Country(834, "TZ", "TZA", ("fr".equals(lang)) ? "République-Unie de Tanzanie" : "United Republic Of Tanzania"));
        flags.add(new Country(840, "US", "USA", ("fr".equals(lang)) ? "États-Unis" : "United States"));
        flags.add(new Country(850, "VI", "VIR", ("fr".equals(lang)) ? "Îles Vierges des États-Unis" : "U.S. Virgin Islands"));
        flags.add(new Country(854, "BF", "BFA", ("fr".equals(lang)) ? "Burkina Faso" : "Burkina Faso"));
        flags.add(new Country(858, "UY", "URY", ("fr".equals(lang)) ? "Uruguay" : "Uruguay"));
        flags.add(new Country(860, "UZ", "UZB", ("fr".equals(lang)) ? "Ouzbékistan" : "Uzbekistan"));
        flags.add(new Country(862, "VE", "VEN", ("fr".equals(lang)) ? "Venezuela" : "Venezuela"));
        flags.add(new Country(876, "WF", "WLF", ("fr".equals(lang)) ? "Wallis et Futuna" : "Wallis and Futuna"));
        flags.add(new Country(882, "WS", "WSM", ("fr".equals(lang)) ? "Samoa" : "Samoa"));
        flags.add(new Country(887, "YE", "YEM", ("fr".equals(lang)) ? "Yémen" : "Yemen"));
        flags.add(new Country(894, "ZM", "ZMB", ("fr".equals(lang)) ? "Zambie" : "Zambia"));

        return flags;
    }

}
