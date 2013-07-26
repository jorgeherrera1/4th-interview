package com.fourthsource.interview.common;

import java.util.Collection;

import com.fourthsource.interview.dto.SkillDTO;
import com.fourthsource.interview.model.Skill;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.Collections2;

public final class Skills {

    private Skills() {
    }

    private static final Function<Skill, SkillDTO> toDTOFunction = new Function<Skill, SkillDTO>() {

        @Override
        public SkillDTO apply(Skill skill) {
            Preconditions.checkNotNull(skill);

            SkillDTO dto = new SkillDTO();
            dto.setName(skill.getName());
            dto.setDescription(skill.getDescription());

            return dto;
        }

    };

    private static final Function<SkillDTO, Skill> fromDTOFunction = new Function<SkillDTO, Skill>() {

        @Override
        public Skill apply(SkillDTO dto) {
            Preconditions.checkNotNull(dto);

            Skill skill = new Skill();
            skill.setName(dto.getName());
            skill.setDescription(dto.getDescription());

            return skill;
        }

    };

    public static SkillDTO toDTO(Skill skill) {
        SkillDTO dto = toDTOFunction.apply(skill);
        
        return dto;
    }

    public static Skill fromDTO(SkillDTO dto) {
        Skill skill = fromDTOFunction.apply(dto);

        return skill;
    }

    public static Collection<SkillDTO> toCollectionOfDTOs(
            Collection<Skill> skills) {
        Preconditions.checkNotNull(skills);
        
        Collection<SkillDTO> dtos = Collections2.transform(skills, toDTOFunction);

        return dtos;
    }

}
