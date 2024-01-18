create database bootcamp_exercise4;
show databases;
use bootcamp_exercise4;

create table players (
	player_id integer not null unique,
    group_id integer not null
);

create table matches (
	match_id integer not null unique,
    first_player integer not null,
    second_player integer not null,
    first_score integer not null,
    second_score integer not null
);

-- compute the winner in each group
-- winner -> scored max points within the group, with lowest ID
insert into players values 
	(20,2),
    (30,1),
    (40,3),
    (45,1),
    (50,2),
    (65,1);

insert into matches values
(1,30,45,10,12),
(2,20,50,5,5),
(13,65,45,10,10),
(5,30,65,3,15),
(42,45,65,8,4);

with 
	final_table as (
		select m.first_player as player, sum(m.first_score) as score
		from matches m
		group by m.first_player
		union 
		select m.second_player as player, sum(m.second_score) as score
		from matches m
		group by m.second_player
    ), winner_table as (
		select ft.player, sum(ft.score) as scores
		from final_table ft
		group by ft.player
    ), result_table as (
		select p.group_id, wt.player,wt.scores
		from players p 
		left join winner_table wt 
		on p.player_id = wt.player
        order by wt.scores desc
    )
select rt.group_id, rt.player
from result_table rt;
