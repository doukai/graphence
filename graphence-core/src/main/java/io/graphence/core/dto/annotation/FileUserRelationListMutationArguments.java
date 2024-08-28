package io.graphence.core.dto.annotation;

import io.graphoenix.file.dto.annotation.FileInput;
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
public @interface FileUserRelationListMutationArguments {
  String id() default "";

  String userRef() default "";

  UserInput user() default @UserInput;

  String fileRef() default "";

  FileInput file() default @FileInput;

  boolean isDeprecated() default false;

  int version() default 0;

  int realmId() default 0;

  String createUserId() default "";

  String createTime() default "";

  String updateUserId() default "";

  String updateTime() default "";

  String createGroupId() default "";

  String __typename() default "FileUserRelation";

  FileUserRelationInput[] list() default {};

  FileUserRelationExpression where() default @FileUserRelationExpression;

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

  String $list() default "";

  String $where() default "";
}
