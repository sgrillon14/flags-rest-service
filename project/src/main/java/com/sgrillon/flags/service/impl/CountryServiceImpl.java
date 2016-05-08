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
        flags.add(new Country(4, "AF", "AFG", ("en".equals(lang)) ? "Afghanistan" : "Afghanistan"));
        flags.add(new Country(8, "AL", "ALB", ("en".equals(lang)) ? "Albania" : "Albanie"));
        flags.add(new Country(10, "AQ", "ATA", ("en".equals(lang)) ? "Antarctica" : "Antarctique"));
        flags.add(new Country(12, "DZ", "DZA", ("en".equals(lang)) ? "Algeria" : "Algérie"));
        flags.add(new Country(16, "AS", "ASM", ("en".equals(lang)) ? "American Samoa" : "Samoa Américaines"));
        flags.add(new Country(20, "AD", "AND", ("en".equals(lang)) ? "Andorra" : "Andorre"));
        flags.add(new Country(24, "AO", "AGO", ("en".equals(lang)) ? "Angola" : "Angola"));
        flags.add(new Country(28, "AG", "ATG", ("en".equals(lang)) ? "Antigua and Barbuda" : "Antigua-et-Barbuda"));
        flags.add(new Country(31, "AZ", "AZE", ("en".equals(lang)) ? "Azerbaijan" : "Azerbaïdjan"));
        flags.add(new Country(32, "AR", "ARG", ("en".equals(lang)) ? "Argentina" : "Argentine"));
        flags.add(new Country(36, "AU", "AUS", ("en".equals(lang)) ? "Australia" : "Australie"));
        flags.add(new Country(40, "AT", "AUT", ("en".equals(lang)) ? "Austria" : "Autriche"));
        flags.add(new Country(44, "BS", "BHS", ("en".equals(lang)) ? "Bahamas" : "Bahamas"));
        flags.add(new Country(48, "BH", "BHR", ("en".equals(lang)) ? "Bahrain" : "Bahreïn"));
        flags.add(new Country(50, "BD", "BGD", ("en".equals(lang)) ? "Bangladesh" : "Bangladesh"));
        flags.add(new Country(51, "AM", "ARM", ("en".equals(lang)) ? "Armenia" : "Arménie"));
        flags.add(new Country(52, "BB", "BRB", ("en".equals(lang)) ? "Barbados" : "Barbade"));
        flags.add(new Country(56, "BE", "BEL", ("en".equals(lang)) ? "Belgium" : "Belgique"));
        flags.add(new Country(60, "BM", "BMU", ("en".equals(lang)) ? "Bermuda" : "Bermudes"));
        flags.add(new Country(64, "BT", "BTN", ("en".equals(lang)) ? "Bhutan" : "Bhoutan"));
        flags.add(new Country(68, "BO", "BOL", ("en".equals(lang)) ? "Bolivia" : "Bolivie"));
        flags.add(new Country(70, "BA", "BIH", ("en".equals(lang)) ? "Bosnia and Herzegovina" : "Bosnie-Herzégovine"));
        flags.add(new Country(72, "BW", "BWA", ("en".equals(lang)) ? "Botswana" : "Botswana"));
        flags.add(new Country(74, "BV", "BVT", ("en".equals(lang)) ? "Bouvet Island" : "Île Bouvet"));
        flags.add(new Country(76, "BR", "BRA", ("en".equals(lang)) ? "Brazil" : "Brésil"));
        flags.add(new Country(84, "BZ", "BLZ", ("en".equals(lang)) ? "Belize" : "Belize"));
        flags.add(new Country(86, "IO", "IOT", ("en".equals(lang)) ? "British Indian Ocean Territory" : "Territoire Britannique de l'Océan Indien"));
        flags.add(new Country(90, "SB", "SLB", ("en".equals(lang)) ? "Solomon Islands" : "Îles Salomon"));
        flags.add(new Country(92, "VG", "VGB", ("en".equals(lang)) ? "British Virgin Islands" : "Îles Vierges Britanniques"));
        flags.add(new Country(96, "BN", "BRN", ("en".equals(lang)) ? "Brunei Darussalam" : "Brunéi Darussalam"));
        flags.add(new Country(100, "BG", "BGR", ("en".equals(lang)) ? "Bulgaria" : "Bulgarie"));
        flags.add(new Country(104, "MM", "MMR", ("en".equals(lang)) ? "Myanmar" : "Myanmar"));
        flags.add(new Country(108, "BI", "BDI", ("en".equals(lang)) ? "Burundi" : "Burundi"));
        flags.add(new Country(112, "BY", "BLR", ("en".equals(lang)) ? "Belarus" : "Bélarus"));
        flags.add(new Country(116, "KH", "KHM", ("en".equals(lang)) ? "Cambodia" : "Cambodge"));
        flags.add(new Country(120, "CM", "CMR", ("en".equals(lang)) ? "Cameroon" : "Cameroun"));
        flags.add(new Country(124, "CA", "CAN", ("en".equals(lang)) ? "Canada" : "Canada"));
        flags.add(new Country(132, "CV", "CPV", ("en".equals(lang)) ? "Cape Verde" : "Cap-vert"));
        flags.add(new Country(136, "KY", "CYM", ("en".equals(lang)) ? "Cayman Islands" : "Îles Caïmanes"));
        flags.add(new Country(140, "CF", "CAF", ("en".equals(lang)) ? "Central African" : "République Centrafricaine"));
        flags.add(new Country(144, "LK", "LKA", ("en".equals(lang)) ? "Sri Lanka" : "Sri Lanka"));
        flags.add(new Country(148, "TD", "TCD", ("en".equals(lang)) ? "Chad" : "Tchad"));
        flags.add(new Country(152, "CL", "CHL", ("en".equals(lang)) ? "Chile" : "Chili"));
        flags.add(new Country(156, "CN", "CHN", ("en".equals(lang)) ? "China" : "Chine"));
        flags.add(new Country(158, "TW", "TWN", ("en".equals(lang)) ? "Taiwan" : "Taïwan"));
        flags.add(new Country(162, "CX", "CXR", ("en".equals(lang)) ? "Christmas Island" : "Île Christmas"));
        flags.add(new Country(166, "CC", "CCK", ("en".equals(lang)) ? "Cocos (Keeling) Islands" : "Îles Cocos (Keeling)"));
        flags.add(new Country(170, "CO", "COL", ("en".equals(lang)) ? "Colombia" : "Colombie"));
        flags.add(new Country(174, "KM", "COM", ("en".equals(lang)) ? "Comoros" : "Comores"));
        flags.add(new Country(175, "YT", "MYT", ("en".equals(lang)) ? "Mayotte" : "Mayotte"));
        flags.add(new Country(178, "CG", "COG", ("en".equals(lang)) ? "Republic of the Congo" : "République du Congo"));
        flags.add(new Country(180, "CD", "COD", ("en".equals(lang)) ? "The Democratic Republic Of The Congo" : "République Démocratique du Congo"));
        flags.add(new Country(184, "CK", "COK", ("en".equals(lang)) ? "Cook Islands" : "Îles Cook"));
        flags.add(new Country(188, "CR", "CRI", ("en".equals(lang)) ? "Costa Rica" : "Costa Rica"));
        flags.add(new Country(191, "HR", "HRV", ("en".equals(lang)) ? "Croatia" : "Croatie"));
        flags.add(new Country(192, "CU", "CUB", ("en".equals(lang)) ? "Cuba" : "Cuba"));
        flags.add(new Country(196, "CY", "CYP", ("en".equals(lang)) ? "Cyprus" : "Chypre"));
        flags.add(new Country(203, "CZ", "CZE", ("en".equals(lang)) ? "Czech Republic" : "République Tchèque"));
        flags.add(new Country(204, "BJ", "BEN", ("en".equals(lang)) ? "Benin" : "Bénin"));
        flags.add(new Country(208, "DK", "DNK", ("en".equals(lang)) ? "Denmark" : "Danemark"));
        flags.add(new Country(212, "DM", "DMA", ("en".equals(lang)) ? "Dominica" : "Dominique"));
        flags.add(new Country(214, "DO", "DOM", ("en".equals(lang)) ? "Dominican Republic" : "République Dominicaine"));
        flags.add(new Country(218, "EC", "ECU", ("en".equals(lang)) ? "Ecuador" : "Équateur"));
        flags.add(new Country(222, "SV", "SLV", ("en".equals(lang)) ? "El Salvador" : "El Salvador"));
        flags.add(new Country(226, "GQ", "GNQ", ("en".equals(lang)) ? "Equatorial Guinea" : "Guinée Équatoriale"));
        flags.add(new Country(231, "ET", "ETH", ("en".equals(lang)) ? "Ethiopia" : "Éthiopie"));
        flags.add(new Country(232, "ER", "ERI", ("en".equals(lang)) ? "Eritrea" : "Érythrée"));
        flags.add(new Country(233, "EE", "EST", ("en".equals(lang)) ? "Estonia" : "Estonie"));
        flags.add(new Country(234, "FO", "FRO", ("en".equals(lang)) ? "Faroe Islands" : "Îles Féroé"));
        flags.add(new Country(238, "FK", "FLK", ("en".equals(lang)) ? "Falkland Islands" : "Îles (malvinas) Falkland"));
        flags.add(new Country(239, "GS", "SGS", ("en".equals(lang)) ? "South Georgia and the South Sandwich Islands" : "Géorgie du Sud et les Îles Sandwich du Sud"));
        flags.add(new Country(242, "FJ", "FJI", ("en".equals(lang)) ? "Fiji" : "Fidji"));
        flags.add(new Country(246, "FI", "FIN", ("en".equals(lang)) ? "Finland" : "Finlande"));
        flags.add(new Country(248, "AX", "ALA", ("en".equals(lang)) ? "Åland Islands" : "Îles Åland"));
        flags.add(new Country(250, "FR", "FRA", ("en".equals(lang)) ? "France" : "France"));
        flags.add(new Country(254, "GF", "GUF", ("en".equals(lang)) ? "French Guiana" : "Guyane Française"));
        flags.add(new Country(258, "PF", "PYF", ("en".equals(lang)) ? "French Polynesia" : "Polynésie Française"));
        flags.add(new Country(260, "TF", "ATF", ("en".equals(lang)) ? "French Southern Territories" : "Terres Australes Françaises"));
        flags.add(new Country(262, "DJ", "DJI", ("en".equals(lang)) ? "Djibouti" : "Djibouti"));
        flags.add(new Country(266, "GA", "GAB", ("en".equals(lang)) ? "Gabon" : "Gabon"));
        flags.add(new Country(268, "GE", "GEO", ("en".equals(lang)) ? "Georgia" : "Géorgie"));
        flags.add(new Country(270, "GM", "GMB", ("en".equals(lang)) ? "Gambia" : "Gambie"));
        flags.add(new Country(275, "PS", "PSE", ("en".equals(lang)) ? "Occupied Palestinian Territory" : "Territoire Palestinien Occupé"));
        flags.add(new Country(276, "DE", "DEU", ("en".equals(lang)) ? "Germany" : "Allemagne"));
        flags.add(new Country(288, "GH", "GHA", ("en".equals(lang)) ? "Ghana" : "Ghana"));
        flags.add(new Country(292, "GI", "GIB", ("en".equals(lang)) ? "Gibraltar" : "Gibraltar"));
        flags.add(new Country(296, "KI", "KIR", ("en".equals(lang)) ? "Kiribati" : "Kiribati"));
        flags.add(new Country(300, "GR", "GRC", ("en".equals(lang)) ? "Greece" : "Grèce"));
        flags.add(new Country(304, "GL", "GRL", ("en".equals(lang)) ? "Greenland" : "Groenland"));
        flags.add(new Country(308, "GD", "GRD", ("en".equals(lang)) ? "Grenada" : "Grenade"));
        flags.add(new Country(312, "GP", "GLP", ("en".equals(lang)) ? "Guadeloupe" : "Guadeloupe"));
        flags.add(new Country(316, "GU", "GUM", ("en".equals(lang)) ? "Guam" : "Guam"));
        flags.add(new Country(320, "GT", "GTM", ("en".equals(lang)) ? "Guatemala" : "Guatemala"));
        flags.add(new Country(324, "GN", "GIN", ("en".equals(lang)) ? "Guinea" : "Guinée"));
        flags.add(new Country(328, "GY", "GUY", ("en".equals(lang)) ? "Guyana" : "Guyana"));
        flags.add(new Country(332, "HT", "HTI", ("en".equals(lang)) ? "Haiti" : "Haïti"));
        flags.add(new Country(334, "HM", "HMD", ("en".equals(lang)) ? "Heard Island and McDonald Islands" : "Îles Heard et Mcdonald"));
        flags.add(new Country(336, "VA", "VAT", ("en".equals(lang)) ? "Vatican City State" : "Saint-Siège (état de la Cité du Vatican)"));
        flags.add(new Country(340, "HN", "HND", ("en".equals(lang)) ? "Honduras" : "Honduras"));
        flags.add(new Country(344, "HK", "HKG", ("en".equals(lang)) ? "Hong Kong" : "Hong-Kong"));
        flags.add(new Country(348, "HU", "HUN", ("en".equals(lang)) ? "Hungary" : "Hongrie"));
        flags.add(new Country(352, "IS", "ISL", ("en".equals(lang)) ? "Iceland" : "Islande"));
        flags.add(new Country(356, "IN", "IND", ("en".equals(lang)) ? "India" : "Inde"));
        flags.add(new Country(360, "ID", "IDN", ("en".equals(lang)) ? "Indonesia" : "Indonésie"));
        flags.add(new Country(364, "IR", "IRN", ("en".equals(lang)) ? "Islamic Republic of Iran" : "République Islamique d'Iran"));
        flags.add(new Country(368, "IQ", "IRQ", ("en".equals(lang)) ? "Iraq" : "Iraq"));
        flags.add(new Country(372, "IE", "IRL", ("en".equals(lang)) ? "Ireland" : "Irlande"));
        flags.add(new Country(376, "IL", "ISR", ("en".equals(lang)) ? "Israel" : "Israël"));
        flags.add(new Country(380, "IT", "ITA", ("en".equals(lang)) ? "Italy" : "Italie"));
        flags.add(new Country(384, "CI", "CIV", ("en".equals(lang)) ? "Côte d'Ivoire" : "Côte d'Ivoire"));
        flags.add(new Country(388, "JM", "JAM", ("en".equals(lang)) ? "Jamaica" : "Jamaïque"));
        flags.add(new Country(392, "JP", "JPN", ("en".equals(lang)) ? "Japan" : "Japon"));
        flags.add(new Country(398, "KZ", "KAZ", ("en".equals(lang)) ? "Kazakhstan" : "Kazakhstan"));
        flags.add(new Country(400, "JO", "JOR", ("en".equals(lang)) ? "Jordan" : "Jordanie"));
        flags.add(new Country(404, "KE", "KEN", ("en".equals(lang)) ? "Kenya" : "Kenya"));
        flags.add(new Country(408, "KP", "PRK", ("en".equals(lang)) ? "Democratic People's Republic of Korea" : "République Populaire Démocratique de Corée"));
        flags.add(new Country(410, "KR", "KOR", ("en".equals(lang)) ? "Republic of Korea" : "République de Corée"));
        flags.add(new Country(414, "KW", "KWT", ("en".equals(lang)) ? "Kuwait" : "Koweït"));
        flags.add(new Country(417, "KG", "KGZ", ("en".equals(lang)) ? "Kyrgyzstan" : "Kirghizistan"));
        flags.add(new Country(418, "LA", "LAO", ("en".equals(lang)) ? "Lao People's Democratic Republic" : "République Démocratique Populaire Lao"));
        flags.add(new Country(422, "LB", "LBN", ("en".equals(lang)) ? "Lebanon" : "Liban"));
        flags.add(new Country(426, "LS", "LSO", ("en".equals(lang)) ? "Lesotho" : "Lesotho"));
        flags.add(new Country(428, "LV", "LVA", ("en".equals(lang)) ? "Latvia" : "Lettonie"));
        flags.add(new Country(430, "LR", "LBR", ("en".equals(lang)) ? "Liberia" : "Libéria"));
        flags.add(new Country(434, "LY", "LBY", ("en".equals(lang)) ? "Libyan Arab Jamahiriya" : "Jamahiriya Arabe Libyenne"));
        flags.add(new Country(438, "LI", "LIE", ("en".equals(lang)) ? "Liechtenstein" : "Liechtenstein"));
        flags.add(new Country(440, "LT", "LTU", ("en".equals(lang)) ? "Lithuania" : "Lituanie"));
        flags.add(new Country(442, "LU", "LUX", ("en".equals(lang)) ? "Luxembourg" : "Luxembourg"));
        flags.add(new Country(446, "MO", "MAC", ("en".equals(lang)) ? "Macao" : "Macao"));
        flags.add(new Country(450, "MG", "MDG", ("en".equals(lang)) ? "Madagascar" : "Madagascar"));
        flags.add(new Country(454, "MW", "MWI", ("en".equals(lang)) ? "Malawi" : "Malawi"));
        flags.add(new Country(458, "MY", "MYS", ("en".equals(lang)) ? "Malaysia" : "Malaisie"));
        flags.add(new Country(462, "MV", "MDV", ("en".equals(lang)) ? "Maldives" : "Maldives"));
        flags.add(new Country(466, "ML", "MLI", ("en".equals(lang)) ? "Mali" : "Mali"));
        flags.add(new Country(470, "MT", "MLT", ("en".equals(lang)) ? "Malta" : "Malte"));
        flags.add(new Country(474, "MQ", "MTQ", ("en".equals(lang)) ? "Martinique" : "Martinique"));
        flags.add(new Country(478, "MR", "MRT", ("en".equals(lang)) ? "Mauritania" : "Mauritanie"));
        flags.add(new Country(480, "MU", "MUS", ("en".equals(lang)) ? "Mauritius" : "Maurice"));
        flags.add(new Country(484, "MX", "MEX", ("en".equals(lang)) ? "Mexico" : "Mexique"));
        flags.add(new Country(492, "MC", "MCO", ("en".equals(lang)) ? "Monaco" : "Monaco"));
        flags.add(new Country(496, "MN", "MNG", ("en".equals(lang)) ? "Mongolia" : "Mongolie"));
        flags.add(new Country(498, "MD", "MDA", ("en".equals(lang)) ? "Republic of Moldova" : "République de Moldova"));
        flags.add(new Country(500, "MS", "MSR", ("en".equals(lang)) ? "Montserrat" : "Montserrat"));
        flags.add(new Country(504, "MA", "MAR", ("en".equals(lang)) ? "Morocco" : "Maroc"));
        flags.add(new Country(508, "MZ", "MOZ", ("en".equals(lang)) ? "Mozambique" : "Mozambique"));
        flags.add(new Country(512, "OM", "OMN", ("en".equals(lang)) ? "Oman" : "Oman"));
        flags.add(new Country(516, "NA", "NAM", ("en".equals(lang)) ? "Namibia" : "Namibie"));
        flags.add(new Country(520, "NR", "NRU", ("en".equals(lang)) ? "Nauru" : "Nauru"));
        flags.add(new Country(524, "NP", "NPL", ("en".equals(lang)) ? "Nepal" : "Népal"));
        flags.add(new Country(528, "NL", "NLD", ("en".equals(lang)) ? "Netherlands" : "Pays-Bas"));
        flags.add(new Country(533, "AW", "ABW", ("en".equals(lang)) ? "Aruba" : "Aruba"));
        flags.add(new Country(540, "NC", "NCL", ("en".equals(lang)) ? "New Caledonia" : "Nouvelle-Calédonie"));
        flags.add(new Country(548, "VU", "VUT", ("en".equals(lang)) ? "Vanuatu" : "Vanuatu"));
        flags.add(new Country(554, "NZ", "NZL", ("en".equals(lang)) ? "New Zealand" : "Nouvelle-Zélande"));
        flags.add(new Country(558, "NI", "NIC", ("en".equals(lang)) ? "Nicaragua" : "Nicaragua"));
        flags.add(new Country(562, "NE", "NER", ("en".equals(lang)) ? "Niger" : "Niger"));
        flags.add(new Country(566, "NG", "NGA", ("en".equals(lang)) ? "Nigeria" : "Nigéria"));
        flags.add(new Country(570, "NU", "NIU", ("en".equals(lang)) ? "Niue" : "Niué"));
        flags.add(new Country(574, "NF", "NFK", ("en".equals(lang)) ? "Norfolk Island" : "Île Norfolk"));
        flags.add(new Country(578, "NO", "NOR", ("en".equals(lang)) ? "Norway" : "Norvège"));
        flags.add(new Country(580, "MP", "MNP", ("en".equals(lang)) ? "Northern Mariana Islands" : "Îles Mariannes du Nord"));
        flags.add(new Country(581, "UM", "UMI", ("en".equals(lang)) ? "United States Minor Outlying Islands" : "Îles Mineures Éloignées des États-Unis"));
        flags.add(new Country(583, "FM", "FSM", ("en".equals(lang)) ? "Federated States of Micronesia" : "États Fédérés de Micronésie"));
        flags.add(new Country(584, "MH", "MHL", ("en".equals(lang)) ? "Marshall Islands" : "Îles Marshall"));
        flags.add(new Country(585, "PW", "PLW", ("en".equals(lang)) ? "Palau" : "Palaos"));
        flags.add(new Country(586, "PK", "PAK", ("en".equals(lang)) ? "Pakistan" : "Pakistan"));
        flags.add(new Country(591, "PA", "PAN", ("en".equals(lang)) ? "Panama" : "Panama"));
        flags.add(new Country(598, "PG", "PNG", ("en".equals(lang)) ? "Papua New Guinea" : "Papouasie-Nouvelle-Guinée"));
        flags.add(new Country(600, "PY", "PRY", ("en".equals(lang)) ? "Paraguay" : "Paraguay"));
        flags.add(new Country(604, "PE", "PER", ("en".equals(lang)) ? "Peru" : "Pérou"));
        flags.add(new Country(608, "PH", "PHL", ("en".equals(lang)) ? "Philippines" : "Philippines"));
        flags.add(new Country(612, "PN", "PCN", ("en".equals(lang)) ? "Pitcairn" : "Pitcairn"));
        flags.add(new Country(616, "PL", "POL", ("en".equals(lang)) ? "Poland" : "Pologne"));
        flags.add(new Country(620, "PT", "PRT", ("en".equals(lang)) ? "Portugal" : "Portugal"));
        flags.add(new Country(624, "GW", "GNB", ("en".equals(lang)) ? "Guinea-Bissau" : "Guinée-Bissau"));
        flags.add(new Country(626, "TL", "TLS", ("en".equals(lang)) ? "Timor-Leste" : "Timor-Leste"));
        flags.add(new Country(630, "PR", "PRI", ("en".equals(lang)) ? "Puerto Rico" : "Porto Rico"));
        flags.add(new Country(634, "QA", "QAT", ("en".equals(lang)) ? "Qatar" : "Qatar"));
        flags.add(new Country(638, "RE", "REU", ("en".equals(lang)) ? "Réunion" : "Réunion"));
        flags.add(new Country(642, "RO", "ROU", ("en".equals(lang)) ? "Romania" : "Roumanie"));
        flags.add(new Country(643, "RU", "RUS", ("en".equals(lang)) ? "Russian Federation" : "Fédération de Russie"));
        flags.add(new Country(646, "RW", "RWA", ("en".equals(lang)) ? "Rwanda" : "Rwanda"));
        flags.add(new Country(654, "SH", "SHN", ("en".equals(lang)) ? "Saint Helena" : "Sainte-Hélène"));
        flags.add(new Country(659, "KN", "KNA", ("en".equals(lang)) ? "Saint Kitts and Nevis" : "Saint-Kitts-et-Nevis"));
        flags.add(new Country(660, "AI", "AIA", ("en".equals(lang)) ? "Anguilla" : "Anguilla"));
        flags.add(new Country(662, "LC", "LCA", ("en".equals(lang)) ? "Saint Lucia" : "Sainte-Lucie"));
        flags.add(new Country(666, "PM", "SPM", ("en".equals(lang)) ? "Saint-Pierre and Miquelon" : "Saint-Pierre-et-Miquelon"));
        flags.add(new Country(670, "VC", "VCT", ("en".equals(lang)) ? "Saint Vincent and the Grenadines" : "Saint-Vincent-et-les Grenadines"));
        flags.add(new Country(674, "SM", "SMR", ("en".equals(lang)) ? "San Marino" : "Saint-Marin"));
        flags.add(new Country(678, "ST", "STP", ("en".equals(lang)) ? "Sao Tome and Principe" : "Sao Tomé-et-Principe"));
        flags.add(new Country(682, "SA", "SAU", ("en".equals(lang)) ? "Saudi Arabia" : "Arabie Saoudite"));
        flags.add(new Country(686, "SN", "SEN", ("en".equals(lang)) ? "Senegal" : "Sénégal"));
        flags.add(new Country(690, "SC", "SYC", ("en".equals(lang)) ? "Seychelles" : "Seychelles"));
        flags.add(new Country(694, "SL", "SLE", ("en".equals(lang)) ? "Sierra Leone" : "Sierra Leone"));
        flags.add(new Country(702, "SG", "SGP", ("en".equals(lang)) ? "Singapore" : "Singapour"));
        flags.add(new Country(703, "SK", "SVK", ("en".equals(lang)) ? "Slovakia" : "Slovaquie"));
        flags.add(new Country(704, "VN", "VNM", ("en".equals(lang)) ? "Vietnam" : "Viet Nam"));
        flags.add(new Country(705, "SI", "SVN", ("en".equals(lang)) ? "Slovenia" : "Slovénie"));
        flags.add(new Country(706, "SO", "SOM", ("en".equals(lang)) ? "Somalia" : "Somalie"));
        flags.add(new Country(710, "ZA", "ZAF", ("en".equals(lang)) ? "South Africa" : "Afrique du Sud"));
        flags.add(new Country(716, "ZW", "ZWE", ("en".equals(lang)) ? "Zimbabwe" : "Zimbabwe"));
        flags.add(new Country(724, "ES", "ESP", ("en".equals(lang)) ? "Spain" : "Espagne"));
        flags.add(new Country(732, "EH", "ESH", ("en".equals(lang)) ? "Western Sahara" : "Sahara Occidental"));
        flags.add(new Country(736, "SD", "SDN", ("en".equals(lang)) ? "Sudan" : "Soudan"));
        flags.add(new Country(740, "SR", "SUR", ("en".equals(lang)) ? "Suriname" : "Suriname"));
        flags.add(new Country(744, "SJ", "SJM", ("en".equals(lang)) ? "Svalbard and Jan Mayen" : "Svalbard etÎle Jan Mayen"));
        flags.add(new Country(748, "SZ", "SWZ", ("en".equals(lang)) ? "Swaziland" : "Swaziland"));
        flags.add(new Country(752, "SE", "SWE", ("en".equals(lang)) ? "Sweden" : "Suède"));
        flags.add(new Country(756, "CH", "CHE", ("en".equals(lang)) ? "Switzerland" : "Suisse"));
        flags.add(new Country(760, "SY", "SYR", ("en".equals(lang)) ? "Syrian Arab Republic" : "République Arabe Syrienne"));
        flags.add(new Country(762, "TJ", "TJK", ("en".equals(lang)) ? "Tajikistan" : "Tadjikistan"));
        flags.add(new Country(764, "TH", "THA", ("en".equals(lang)) ? "Thailand" : "Thaïlande"));
        flags.add(new Country(768, "TG", "TGO", ("en".equals(lang)) ? "Togo" : "Togo"));
        flags.add(new Country(772, "TK", "TKL", ("en".equals(lang)) ? "Tokelau" : "Tokelau"));
        flags.add(new Country(776, "TO", "TON", ("en".equals(lang)) ? "Tonga" : "Tonga"));
        flags.add(new Country(780, "TT", "TTO", ("en".equals(lang)) ? "Trinidad and Tobago" : "Trinité-et-Tobago"));
        flags.add(new Country(784, "AE", "ARE", ("en".equals(lang)) ? "United Arab Emirates" : "Émirats Arabes Unis"));
        flags.add(new Country(788, "TN", "TUN", ("en".equals(lang)) ? "Tunisia" : "Tunisie"));
        flags.add(new Country(792, "TR", "TUR", ("en".equals(lang)) ? "Turkey" : "Turquie"));
        flags.add(new Country(795, "TM", "TKM", ("en".equals(lang)) ? "Turkmenistan" : "Turkménistan"));
        flags.add(new Country(796, "TC", "TCA", ("en".equals(lang)) ? "Turks and Caicos Islands" : "Îles Turks et Caïques"));
        flags.add(new Country(798, "TV", "TUV", ("en".equals(lang)) ? "Tuvalu" : "Tuvalu"));
        flags.add(new Country(800, "UG", "UGA", ("en".equals(lang)) ? "Uganda" : "Ouganda"));
        flags.add(new Country(804, "UA", "UKR", ("en".equals(lang)) ? "Ukraine" : "Ukraine"));
        flags.add(new Country(807, "MK", "MKD", ("en".equals(lang)) ? "The Former Yugoslav Republic of Macedonia" : "L'ex-République Yougoslave de Macédoine"));
        flags.add(new Country(818, "EG", "EGY", ("en".equals(lang)) ? "Egypt" : "Égypte"));
        flags.add(new Country(826, "GB", "GBR", ("en".equals(lang)) ? "United Kingdom" : "Royaume-Uni"));
        flags.add(new Country(833, "IM", "IMN", ("en".equals(lang)) ? "Isle of Man" : "Île de Man"));
        flags.add(new Country(834, "TZ", "TZA", ("en".equals(lang)) ? "United Republic Of Tanzania" : "République-Unie de Tanzanie"));
        flags.add(new Country(840, "US", "USA", ("en".equals(lang)) ? "United States" : "États-Unis"));
        flags.add(new Country(850, "VI", "VIR", ("en".equals(lang)) ? "U.S. Virgin Islands" : "Îles Vierges des États-Unis"));
        flags.add(new Country(854, "BF", "BFA", ("en".equals(lang)) ? "Burkina Faso" : "Burkina Faso"));
        flags.add(new Country(858, "UY", "URY", ("en".equals(lang)) ? "Uruguay" : "Uruguay"));
        flags.add(new Country(860, "UZ", "UZB", ("en".equals(lang)) ? "Uzbekistan" : "Ouzbékistan"));
        flags.add(new Country(862, "VE", "VEN", ("en".equals(lang)) ? "Venezuela" : "Venezuela"));
        flags.add(new Country(876, "WF", "WLF", ("en".equals(lang)) ? "Wallis and Futuna" : "Wallis et Futuna"));
        flags.add(new Country(882, "WS", "WSM", ("en".equals(lang)) ? "Samoa" : "Samoa"));
        flags.add(new Country(887, "YE", "YEM", ("en".equals(lang)) ? "Yemen" : "Yémen"));
        flags.add(new Country(894, "ZM", "ZMB", ("en".equals(lang)) ? "Zambia" : "Zambie"));
        return flags;
    }

}
