/**
 * Copyright (C) 2015 digitalfondue (info@digitalfondue.ch)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ch.digitalfondue.jfiveparse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Document extends Node {
    private final List<Node> childNodes = new ArrayList<>(2);
    private DocumentType doctype;

    @Override
    public byte getNodeType() {
        return DOCUMENT_NODE;
    }

    @Override
    public List<Node> getChildNodes() {
        return Collections.unmodifiableList(childNodes);
    }

    @Override
    List<Node> getMutableChildNodes() {
        return childNodes;
    }

    public void setDoctype(DocumentType doctype) {
        this.doctype = doctype;
    }

    public DocumentType getDoctype() {
        return doctype;
    }

    @Override
    public String getNodeName() {
        return "#document";
    }
}