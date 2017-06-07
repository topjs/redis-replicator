/*
 * Copyright 2016 leon chen
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.moilioncircle.redis.replicator.cmd.impl;

import com.moilioncircle.redis.replicator.cmd.Command;

/**
 * @author Leon Chen
 * @since 2.1.0
 */
public class MoveCommand implements Command {
    private String key;
    private int db;
    private byte[] rawKey;

    public MoveCommand() {
    }

    public MoveCommand(String key, int db) {
        this(key, db, null);
    }

    public MoveCommand(String key, int db, byte[] rawKey) {
        this.key = key;
        this.db = db;
        this.rawKey = rawKey;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getDb() {
        return db;
    }

    public void setDb(int db) {
        this.db = db;
    }

    public byte[] getRawKey() {
        return rawKey;
    }

    public void setRawKey(byte[] rawKey) {
        this.rawKey = rawKey;
    }

    @Override
    public String toString() {
        return "MoveCommand{" +
                "key='" + key + '\'' +
                ", db=" + db +
                '}';
    }
}
