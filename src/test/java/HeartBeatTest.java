/*
 * Copyright 2004-2014 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */


import java.net.HttpURLConnection;
import java.net.URL;

import org.seasar.extension.unit.S2TestCase;

/**
 * @author higa
 *
 */
public class HeartBeatTest extends S2TestCase {

	String webEncode = "utf-8";

    protected void setUp() throws Exception {
        include("app.dicon");
    }

    /**
     * @throws Exception
     */
    public void testHearBeatEntryEnter() throws Exception {
    	URL url = new URL("http://localhost:8080/Hakisute/entry/enter");
    	HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    	connection.setRequestMethod("GET");
    	assertEquals(connection.getResponseCode(), HttpURLConnection.HTTP_OK);
    }

    /**
     * @throws Exception
     */
    public void testHearBeatEntryConfirm() throws Exception {
    	URL url = new URL("http://localhost:8080/Hakisute/entry/confirm");
    	HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    	connection.setRequestMethod("GET");
    	assertEquals(connection.getResponseCode(), HttpURLConnection.HTTP_OK);
    }

    /**
     * @throws Exception
     */
    public void testHearBeatEntryComplete() throws Exception {
    	URL url = new URL("http://localhost:8080/Hakisute/entry/complete");
    	HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    	connection.setRequestMethod("GET");
    	assertEquals(connection.getResponseCode(), HttpURLConnection.HTTP_OK);
    }

}