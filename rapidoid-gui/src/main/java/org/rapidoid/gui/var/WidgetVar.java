package org.rapidoid.gui.var;

/*
 * #%L
 * rapidoid-gui
 * %%
 * Copyright (C) 2014 - 2015 Nikolche Mihajlovski and contributors
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import java.io.Serializable;

import org.rapidoid.annotation.Authors;
import org.rapidoid.annotation.Since;
import org.rapidoid.http.fast.Reqs;
import org.rapidoid.var.impl.AbstractVar;

@Authors("Nikolche Mihajlovski")
@Since("4.0.2")
public abstract class WidgetVar<T extends Serializable> extends AbstractVar<T> {

	private static final long serialVersionUID = 2761159925375675659L;

	protected boolean initial;

	public WidgetVar(String name, boolean initial) {
		super(name);
		this.initial = initial;
	}

	protected boolean getBool() {
		return Reqs.req().data(name(), false);
	}

}