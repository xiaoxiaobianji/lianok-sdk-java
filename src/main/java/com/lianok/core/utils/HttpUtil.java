package com.lianok.core.utils;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;

public final class HttpUtil {
    private final static String ENCODING = "UTF-8";
    private static final String BOUNDARY = "--------------------lianok_1a2b3c4d5e6f";
    private static final String NEWLINE = "\r\n";

    public static String doPost(String httpUrl, String param) throws Exception {
        return doPost(httpUrl, param, 10000);
    }

    public static String upload(String httpUrl, Map<String, String> param, Map<String, byte[]> fileMap) throws Exception {
        return upload(httpUrl, param, fileMap, 10000);
    }

    public static String doPost(String httpUrl, String param, Integer timeout) throws Exception {
        StringBuilder result = new StringBuilder();
        //连接
        HttpURLConnection connection = null;
        OutputStream os = null;
        InputStream is = null;
        BufferedReader br = null;
        try {
            //创建连接对象
            URL url = new URL(httpUrl);
            //创建连接
            connection = (HttpURLConnection) url.openConnection();
            //设置请求方法
            connection.setRequestMethod("POST");
            //设置连接超时时间
            connection.setConnectTimeout(timeout);
            //设置读取超时时间
            connection.setReadTimeout(timeout);
            //设置是否可读取
            connection.setDoOutput(true);
            //设置响应是否可读取
            connection.setDoInput(true);
            //设置参数类型
            connection.setRequestProperty("Content-Type", "application/json");
            //拼装参数
            if (param != null && !param.equals("")) {
                //设置参数
                os = connection.getOutputStream();
                //拼装参数
                os.write(param.getBytes(ENCODING));
            }
            if (connection.getResponseCode() == 200) {
                is = connection.getInputStream();
                if (is != null) {
                    br = new BufferedReader(new InputStreamReader(is, ENCODING));
                    String temp;
                    if ((temp = br.readLine()) != null) {
                        result.append(temp);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != connection) {
                connection.disconnect();
            }
        }
        return result.toString();
    }

    public static String upload(String httpUrl, Map<String, String> param, Map<String, byte[]> fileMap, Integer timeout) throws IOException {
        HttpURLConnection connection = null;
        try {
            //创建连接对象
            URL url = new URL(httpUrl);
            //创建连接
            connection = (HttpURLConnection) url.openConnection();
            //设置请求方法
            connection.setRequestMethod("POST");
            //设置连接超时时间
            connection.setConnectTimeout(timeout);
            //设置读取超时时间
            connection.setReadTimeout(timeout);
            //设置是否可读取
            connection.setDoOutput(true);
            //设置响应是否可读取
            connection.setDoInput(true);
            connection.setUseCaches(false);
            //设置参数类型
            connection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + BOUNDARY);

            //拼装参数
            OutputStream out = new DataOutputStream(connection.getOutputStream());
            // text
            if (param != null) {
                StringBuilder strBuf = new StringBuilder();
                for (Map.Entry<String, String> entry : param.entrySet()) {
                    String inputName = entry.getKey();
                    String inputValue = entry.getValue();
                    if (inputValue == null) {
                        continue;
                    }
                    strBuf.append(NEWLINE).append("--").append(BOUNDARY).append(NEWLINE);
                    strBuf.append("Content-Disposition: form-data; name=\"").append(inputName).append("\"").append(NEWLINE).append(NEWLINE);
                    strBuf.append(inputValue);
                }
                out.write(strBuf.toString().getBytes());
            }

            // file
            if (fileMap != null) {
                Iterator<Map.Entry<String, byte[]>> iter = fileMap.entrySet().iterator();
                while (iter.hasNext()) {
                    Map.Entry<String, byte[]> entry = iter.next();
                    String filename = entry.getKey();
                    byte[] fileBytes = entry.getValue();
                    if (fileBytes == null) {
                        continue;
                    }

                    String strBuf = NEWLINE + "--" + BOUNDARY + NEWLINE +
                            "Content-Disposition: form-data; name=\"file\"; filename=\"" + filename + "\"" + NEWLINE +
                            "Content-Type:" + "image/jpeg" + NEWLINE + NEWLINE;
                    out.write(strBuf.getBytes());

                    DataInputStream in = new DataInputStream(new ByteArrayInputStream(fileBytes));
                    int bytes = 0;
                    byte[] bufferOut = new byte[1024];
                    while ((bytes = in.read(bufferOut)) != -1) {
                        out.write(bufferOut, 0, bytes);
                    }
                    in.close();
                }
            }

            byte[] endData = ("\r\n--" + BOUNDARY + "--\r\n").getBytes();
            out.write(endData);
            out.flush();
            out.close();

            // 读取返回数据
            StringBuilder strBuf = new StringBuilder();
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                strBuf.append(line);
            }
            reader.close();
            reader = null;

            return strBuf.toString();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (null != connection) {
                connection.disconnect();
            }
        }
    }

}
