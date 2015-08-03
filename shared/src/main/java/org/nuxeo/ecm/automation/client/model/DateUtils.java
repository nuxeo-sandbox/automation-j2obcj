/*
 * Copyright (c) 2006-2011 Nuxeo SA (http://nuxeo.com/) and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     bstefanescu
 */
package org.nuxeo.ecm.automation.client.model;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Date;

/**
 * Parse and encode W3c dates. Only UTC dates are supported (ending in Z): YYYY-MM-DDThh:mm:ssZ (without milliseconds)
 * We use a custom parser since it should work on GWT too.
 *
 * @author <a href="mailto:bs@nuxeo.com">Bogdan Stefanescu</a>
 */
public class DateUtils {

    // Utility class.
    private DateUtils() {
    }

    public static Date parseDate(String date) {
        return DateParser.parseW3CDateTime(date);
    }

    public static String formatDate(Date date) {
        return DateParser.formatW3CDateTime(date);
    }

    public String writeJson() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        OutputStream out = new ByteArrayOutputStream();
        Writer writer = new OutputStreamWriter(out);
        mapper.writeValue(writer, this);
        return "json document file generated";
    }
}
