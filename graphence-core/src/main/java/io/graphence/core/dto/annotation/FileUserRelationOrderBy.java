package io.graphence.core.dto.annotation;

import io.graphoenix.core.dto.enumType.Sort;
import io.graphoenix.file.dto.annotation.FileOrderBy;
import jakarta.annotation.Generated;
import java.lang.String;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface FileUserRelationOrderBy {
  Sort id() default Sort.ASC;

  Sort userRef() default Sort.ASC;

  UserOrderBy1 user() default @UserOrderBy1;

  Sort fileRef() default Sort.ASC;

  FileOrderBy file() default @FileOrderBy;

  Sort isDeprecated() default Sort.ASC;

  Sort version() default Sort.ASC;

  Sort realmId() default Sort.ASC;

  Sort createUserId() default Sort.ASC;

  Sort createTime() default Sort.ASC;

  Sort updateUserId() default Sort.ASC;

  Sort updateTime() default Sort.ASC;

  Sort createGroupId() default Sort.ASC;

  Sort __typename() default Sort.ASC;

  Sort idCount() default Sort.ASC;

  Sort idMax() default Sort.ASC;

  Sort idMin() default Sort.ASC;

  Sort userRefCount() default Sort.ASC;

  Sort userRefMax() default Sort.ASC;

  Sort userRefMin() default Sort.ASC;

  Sort fileRefCount() default Sort.ASC;

  Sort fileRefMax() default Sort.ASC;

  Sort fileRefMin() default Sort.ASC;

  String $id() default "";

  String $userRef() default "";

  String $user() default "";

  String $fileRef() default "";

  String $file() default "";

  String $isDeprecated() default "";

  String $version() default "";

  String $realmId() default "";

  String $createUserId() default "";

  String $createTime() default "";

  String $updateUserId() default "";

  String $updateTime() default "";

  String $createGroupId() default "";

  String $__typename() default "";

  String $idCount() default "";

  String $idMax() default "";

  String $idMin() default "";

  String $userRefCount() default "";

  String $userRefMax() default "";

  String $userRefMin() default "";

  String $fileRefCount() default "";

  String $fileRefMax() default "";

  String $fileRefMin() default "";
}
