/*
 * Teragrep Bloom Filter Library BLF-01
 * Copyright (C) 2019, 2020, 2021, 2022, 2023 Suomen Kanuuna Oy
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://github.com/teragrep/teragrep/blob/main/LICENSE>.
 *
 *
 * Additional permission under GNU Affero General Public License version 3
 * section 7
 *
 * If you modify this Program, or any covered work, by linking or combining it
 * with other code, such other code is not for that reason alone subject to any
 * of the requirements of the GNU Affero GPL version 3 as long as this Program
 * is the same Program as licensed from Suomen Kanuuna Oy without any additional
 * modifications.
 *
 * Supplemented terms under GNU Affero General Public License version 3
 * section 7
 *
 * Origin of the software must be attributed to Suomen Kanuuna Oy. Any modified
 * versions must be marked as "Modified version of" The Program.
 *
 * Names of the licensors and authors may not be used for publicity purposes.
 *
 * No rights are granted for use of trade names, trademarks, or service marks
 * which are in The Program if any.
 *
 * Licensee must indemnify licensors and authors for any liability that these
 * contractual assumptions impose on licensors and authors.
 *
 * To the extent this program is licensed as part of the Commercial versions of
 * Teragrep, the applicable Commercial License may apply to this file if you as
 * a licensee so wish it.
 */

package com.teragrep.blf_01;

import java.util.HashSet;
import java.util.Set;

public class MajorDelimiters implements Delimiters {

    private final Set<Delimiter> delimiterSet;
    MajorDelimiters() {
        this.delimiterSet = new HashSet<>();

        delimiterSet.add(new Delimiter("\t"));
        delimiterSet.add(new Delimiter("\n"));
        delimiterSet.add(new Delimiter("\r"));
        delimiterSet.add(new Delimiter(" "));
        delimiterSet.add(new Delimiter("!"));
        delimiterSet.add(new Delimiter("\""));
        delimiterSet.add(new Delimiter("%0A"));
        delimiterSet.add(new Delimiter("%20"));
        delimiterSet.add(new Delimiter("%21"));
        delimiterSet.add(new Delimiter("%2520"));
        delimiterSet.add(new Delimiter("%2526"));
        delimiterSet.add(new Delimiter("%26"));
        delimiterSet.add(new Delimiter("%28"));
        delimiterSet.add(new Delimiter("%29"));
        delimiterSet.add(new Delimiter("%2B"));
        delimiterSet.add(new Delimiter("%2C"));
        delimiterSet.add(new Delimiter("%3A"));
        delimiterSet.add(new Delimiter("%3B"));
        delimiterSet.add(new Delimiter("%3D"));
        delimiterSet.add(new Delimiter("%5B"));
        delimiterSet.add(new Delimiter("%5D"));
        delimiterSet.add(new Delimiter("%7C"));
        delimiterSet.add(new Delimiter("&"));
        delimiterSet.add(new Delimiter("'"));
        delimiterSet.add(new Delimiter("|"));
        delimiterSet.add(new Delimiter("("));
        delimiterSet.add(new Delimiter(")"));
        delimiterSet.add(new Delimiter("*"));
        delimiterSet.add(new Delimiter("+"));
        delimiterSet.add(new Delimiter(","));
        delimiterSet.add(new Delimiter("--"));
        delimiterSet.add(new Delimiter(";"));
        delimiterSet.add(new Delimiter("<"));
        delimiterSet.add(new Delimiter(">"));
        delimiterSet.add(new Delimiter("?"));
        delimiterSet.add(new Delimiter("["));
        delimiterSet.add(new Delimiter("]"));
        delimiterSet.add(new Delimiter("{"));
        delimiterSet.add(new Delimiter("\\"));
        delimiterSet.add(new Delimiter("}"));
    }

    @Override
    public Set<Delimiter> getDelimiters() {
        return delimiterSet;
    }
}
