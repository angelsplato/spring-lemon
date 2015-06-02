package com.naturalprogrammer.spring.boot;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import org.springframework.data.jpa.domain.AbstractAuditable;

@MappedSuperclass
public abstract class VersionedEntity<U extends BaseUser<U,ID>, ID extends Serializable> extends AbstractAuditable<U, ID> {

	private static final long serialVersionUID = 4310555782328370192L;
	
	@Version
	private long version;

	public long getVersion() {
		return version;
	}

	public void setVersion(long version) {
		this.version = version;
	}
	
}