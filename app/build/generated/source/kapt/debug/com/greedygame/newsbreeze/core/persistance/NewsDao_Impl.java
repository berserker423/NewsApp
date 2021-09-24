package com.greedygame.newsbreeze.core.persistance;

import android.database.Cursor;
import androidx.paging.PagingSource;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.paging.LimitOffsetPagingSource;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.greedygame.newsbreeze.core.data.Article;
import com.greedygame.newsbreeze.core.data.Source;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class NewsDao_Impl implements NewsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Article> __insertionAdapterOfArticle;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  private final SharedSQLiteStatement __preparedStmtOfUpdateArticle;

  public NewsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfArticle = new EntityInsertionAdapter<Article>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `articles` (`id`,`author`,`title`,`description`,`url`,`urlToImage`,`publishedAt`,`content`,`bookmarkStatus`,`isSaved`,`sourceId`,`name`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Article value) {
        stmt.bindLong(1, value.getId());
        if (value.getAuthor() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getAuthor());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTitle());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getUrl());
        }
        if (value.getUrlToImage() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getUrlToImage());
        }
        if (value.getPublishedAt() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getPublishedAt());
        }
        if (value.getContent() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getContent());
        }
        if (value.getBookmarkStatus() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getBookmarkStatus());
        }
        final int _tmp;
        _tmp = value.isSaved() ? 1 : 0;
        stmt.bindLong(10, _tmp);
        final Source _tmpSource = value.getSource();
        if(_tmpSource != null) {
          if (_tmpSource.getSourceId() == null) {
            stmt.bindNull(11);
          } else {
            stmt.bindString(11, _tmpSource.getSourceId());
          }
          if (_tmpSource.getName() == null) {
            stmt.bindNull(12);
          } else {
            stmt.bindString(12, _tmpSource.getName());
          }
        } else {
          stmt.bindNull(11);
          stmt.bindNull(12);
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM articles WHERE isSaved =0";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateArticle = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE articles SET isSaved=? WHERE title = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insertAll(final List<Article> articles,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfArticle.insert(articles);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteAll(final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAll.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public void updateArticle(final boolean isSaved, final String title) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateArticle.acquire();
    int _argIndex = 1;
    final int _tmp;
    _tmp = isSaved ? 1 : 0;
    _stmt.bindLong(_argIndex, _tmp);
    _argIndex = 2;
    if (title == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, title);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateArticle.release(_stmt);
    }
  }

  @Override
  public PagingSource<Integer, Article> newsSource() {
    final String _sql = "SELECT * from articles ORDER BY publishedAt DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new LimitOffsetPagingSource<Article>(_statement, __db, "articles") {
      @Override
      protected List<Article> convertRows(Cursor cursor) {
        final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(cursor, "id");
        final int _cursorIndexOfAuthor = CursorUtil.getColumnIndexOrThrow(cursor, "author");
        final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(cursor, "title");
        final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(cursor, "description");
        final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(cursor, "url");
        final int _cursorIndexOfUrlToImage = CursorUtil.getColumnIndexOrThrow(cursor, "urlToImage");
        final int _cursorIndexOfPublishedAt = CursorUtil.getColumnIndexOrThrow(cursor, "publishedAt");
        final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(cursor, "content");
        final int _cursorIndexOfBookmarkStatus = CursorUtil.getColumnIndexOrThrow(cursor, "bookmarkStatus");
        final int _cursorIndexOfIsSaved = CursorUtil.getColumnIndexOrThrow(cursor, "isSaved");
        final int _cursorIndexOfSourceId = CursorUtil.getColumnIndexOrThrow(cursor, "sourceId");
        final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(cursor, "name");
        final List<Article> _result = new ArrayList<Article>(cursor.getCount());
        while(cursor.moveToNext()) {
          final Article _item;
          final int _tmpId;
          _tmpId = cursor.getInt(_cursorIndexOfId);
          final String _tmpAuthor;
          if (cursor.isNull(_cursorIndexOfAuthor)) {
            _tmpAuthor = null;
          } else {
            _tmpAuthor = cursor.getString(_cursorIndexOfAuthor);
          }
          final String _tmpTitle;
          if (cursor.isNull(_cursorIndexOfTitle)) {
            _tmpTitle = null;
          } else {
            _tmpTitle = cursor.getString(_cursorIndexOfTitle);
          }
          final String _tmpDescription;
          if (cursor.isNull(_cursorIndexOfDescription)) {
            _tmpDescription = null;
          } else {
            _tmpDescription = cursor.getString(_cursorIndexOfDescription);
          }
          final String _tmpUrl;
          if (cursor.isNull(_cursorIndexOfUrl)) {
            _tmpUrl = null;
          } else {
            _tmpUrl = cursor.getString(_cursorIndexOfUrl);
          }
          final String _tmpUrlToImage;
          if (cursor.isNull(_cursorIndexOfUrlToImage)) {
            _tmpUrlToImage = null;
          } else {
            _tmpUrlToImage = cursor.getString(_cursorIndexOfUrlToImage);
          }
          final String _tmpPublishedAt;
          if (cursor.isNull(_cursorIndexOfPublishedAt)) {
            _tmpPublishedAt = null;
          } else {
            _tmpPublishedAt = cursor.getString(_cursorIndexOfPublishedAt);
          }
          final String _tmpContent;
          if (cursor.isNull(_cursorIndexOfContent)) {
            _tmpContent = null;
          } else {
            _tmpContent = cursor.getString(_cursorIndexOfContent);
          }
          final String _tmpBookmarkStatus;
          if (cursor.isNull(_cursorIndexOfBookmarkStatus)) {
            _tmpBookmarkStatus = null;
          } else {
            _tmpBookmarkStatus = cursor.getString(_cursorIndexOfBookmarkStatus);
          }
          final boolean _tmpIsSaved;
          final int _tmp;
          _tmp = cursor.getInt(_cursorIndexOfIsSaved);
          _tmpIsSaved = _tmp != 0;
          final Source _tmpSource;
          if (! (cursor.isNull(_cursorIndexOfSourceId) && cursor.isNull(_cursorIndexOfName))) {
            final String _tmpSourceId;
            if (cursor.isNull(_cursorIndexOfSourceId)) {
              _tmpSourceId = null;
            } else {
              _tmpSourceId = cursor.getString(_cursorIndexOfSourceId);
            }
            final String _tmpName;
            if (cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = cursor.getString(_cursorIndexOfName);
            }
            _tmpSource = new Source(_tmpSourceId,_tmpName);
          }  else  {
            _tmpSource = null;
          }
          _item = new Article(_tmpId,_tmpSource,_tmpAuthor,_tmpTitle,_tmpDescription,_tmpUrl,_tmpUrlToImage,_tmpPublishedAt,_tmpContent,_tmpBookmarkStatus,_tmpIsSaved);
          _result.add(_item);
        }
        return _result;
      }
    };
  }

  @Override
  public Flow<List<Article>> savedNews() {
    final String _sql = "SELECT * from articles WHERE isSaved =1 ORDER BY publishedAt DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"articles"}, new Callable<List<Article>>() {
      @Override
      public List<Article> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfAuthor = CursorUtil.getColumnIndexOrThrow(_cursor, "author");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final int _cursorIndexOfUrlToImage = CursorUtil.getColumnIndexOrThrow(_cursor, "urlToImage");
          final int _cursorIndexOfPublishedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "publishedAt");
          final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "content");
          final int _cursorIndexOfBookmarkStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "bookmarkStatus");
          final int _cursorIndexOfIsSaved = CursorUtil.getColumnIndexOrThrow(_cursor, "isSaved");
          final int _cursorIndexOfSourceId = CursorUtil.getColumnIndexOrThrow(_cursor, "sourceId");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final List<Article> _result = new ArrayList<Article>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Article _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpAuthor;
            if (_cursor.isNull(_cursorIndexOfAuthor)) {
              _tmpAuthor = null;
            } else {
              _tmpAuthor = _cursor.getString(_cursorIndexOfAuthor);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final String _tmpUrl;
            if (_cursor.isNull(_cursorIndexOfUrl)) {
              _tmpUrl = null;
            } else {
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            }
            final String _tmpUrlToImage;
            if (_cursor.isNull(_cursorIndexOfUrlToImage)) {
              _tmpUrlToImage = null;
            } else {
              _tmpUrlToImage = _cursor.getString(_cursorIndexOfUrlToImage);
            }
            final String _tmpPublishedAt;
            if (_cursor.isNull(_cursorIndexOfPublishedAt)) {
              _tmpPublishedAt = null;
            } else {
              _tmpPublishedAt = _cursor.getString(_cursorIndexOfPublishedAt);
            }
            final String _tmpContent;
            if (_cursor.isNull(_cursorIndexOfContent)) {
              _tmpContent = null;
            } else {
              _tmpContent = _cursor.getString(_cursorIndexOfContent);
            }
            final String _tmpBookmarkStatus;
            if (_cursor.isNull(_cursorIndexOfBookmarkStatus)) {
              _tmpBookmarkStatus = null;
            } else {
              _tmpBookmarkStatus = _cursor.getString(_cursorIndexOfBookmarkStatus);
            }
            final boolean _tmpIsSaved;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsSaved);
            _tmpIsSaved = _tmp != 0;
            final Source _tmpSource;
            if (! (_cursor.isNull(_cursorIndexOfSourceId) && _cursor.isNull(_cursorIndexOfName))) {
              final String _tmpSourceId;
              if (_cursor.isNull(_cursorIndexOfSourceId)) {
                _tmpSourceId = null;
              } else {
                _tmpSourceId = _cursor.getString(_cursorIndexOfSourceId);
              }
              final String _tmpName;
              if (_cursor.isNull(_cursorIndexOfName)) {
                _tmpName = null;
              } else {
                _tmpName = _cursor.getString(_cursorIndexOfName);
              }
              _tmpSource = new Source(_tmpSourceId,_tmpName);
            }  else  {
              _tmpSource = null;
            }
            _item = new Article(_tmpId,_tmpSource,_tmpAuthor,_tmpTitle,_tmpDescription,_tmpUrl,_tmpUrlToImage,_tmpPublishedAt,_tmpContent,_tmpBookmarkStatus,_tmpIsSaved);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
